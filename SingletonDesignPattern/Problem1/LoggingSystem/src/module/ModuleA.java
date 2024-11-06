package SingletonDesignPattern.Problem1.LoggingSystem.src.module;

import SingletonDesignPattern.Problem1.LoggingSystem.src.LogLevel;
import SingletonDesignPattern.Problem1.LoggingSystem.src.Logger;

public class ModuleA implements Runnable{
    @Override
    public void run(){
        Logger logger = Logger.getInstance();
        logger.log(LogLevel.INFO,"moduleA is starting their process");
        logger.log(LogLevel.INFO,"moduleA is done their process");
    }
}
