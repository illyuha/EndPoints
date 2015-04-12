package com.google.training.helloworld;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;

/**
 * Defines endpoint functions APIs.
 */
@Api(name = "helloworldendpoints", version = "v1",
scopes = {Constants.EMAIL_SCOPE },
		// clientIds identify which clients are allowed to use these endpoint functions
        clientIds = {Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID },
        description = "API for hello world endpoints.")

public class HelloWorldEndpoints {

   // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "sayHello", path = "sayHello",
            httpMethod = HttpMethod.GET)

    public HelloClass sayHello() {
        return new HelloClass();
    }

    // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "sayHelloByName", path = "sayHelloByName",
            httpMethod = HttpMethod.GET)

    public HelloClass sayHelloByName (@Named("name") String name) {
        return new HelloClass(name);
    }
    
    @ApiMethod(name = "sayHelloByPeriod", path = "sayHelloByPeriod", httpMethod = HttpMethod.GET)
    public HelloClass sayHelloByPeriod(@Named("period") String period, @Named("name") String name)
    {
    	return new HelloClass(period, name);
    }
    
    @ApiMethod(name = "sayHelloByPeriodWithAnswer", path = "sayHelloByPeriodWithAnswer", httpMethod = HttpMethod.GET)
    public HelloClass sayHelloByPeriodWithAnswer(@Named("period") String period, @Named("name") String name,
    		@Named("question") String question, @Named("answer") String answer)
    {
    	return new HelloClass(period, name, question, answer);
    }
}
