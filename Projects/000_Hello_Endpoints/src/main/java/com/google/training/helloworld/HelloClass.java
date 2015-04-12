package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass(String period, String name)
    {
    	message = String.format("Good %s %s!", period, name);
    }
    
    public HelloClass(String period, String name, String question, String answer)
    {
    	message = String.format("Good %s %s!\nThe answer to %s is %s.", period, name, question, answer);    	
    }

    public String getMessage() {
        return message;
    }
}
