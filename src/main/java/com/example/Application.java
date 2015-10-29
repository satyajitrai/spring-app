package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
    private final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Initializing application context");
        @SuppressWarnings("resource")
        ApplicationContext ctx =
                        new FileSystemXmlApplicationContext(
                                        "file:///tmp/conf/applicationContext.xml");
        logger.info("Initialized application context");
        
        ProcessorFactory factory = ctx.getBean(ProcessorFactory.class);
        Processor processor = factory.getProcessor();
        System.out.println(processor.process());
    }
}