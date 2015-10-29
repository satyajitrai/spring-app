package com.example;


public class SimpleProcessor implements Processor {
    
    SimpleConfig config;
    
    public SimpleProcessor(SimpleConfig config) {
        this.config = config;
    }

    @Override
    public String process() {
        return "simple" + config;
    }

}
