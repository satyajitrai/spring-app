# Introduction
This is a small Java standalone (console) application using Spring Framework that attempts to solve following:
1. Use a property file on file system to configure all beans in the ApplicationContext.
2. Initialize application context from a file present on the file system (instead of the class-path).
3. Use a factory to plug-in one of the avilable component via a property file. In this example, the ProcessorFactory uses the value specified in the property ```processor.name``` to pick either ```SimpleProcessor``` or ```AdvanceProcessor```.

Using the file system based property and application context file allows greater flexibility in using different deployment for different environments (although, the config file alone should be sufficient).
