package com.example;


public class AdvanceProcessor implements Processor {
    
    AdvanceConfig conf;
    
    public AdvanceProcessor(AdvanceConfig conf) {
        this.conf = conf;
    }

    @Override
    public String process() {
        return "advanced" + conf;
    }
}
