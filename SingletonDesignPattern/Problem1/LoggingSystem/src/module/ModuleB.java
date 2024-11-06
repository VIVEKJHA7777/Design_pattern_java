package SingletonDesignPattern.Problem1.LoggingSystem.src.module;

import SingletonDesignPattern.Problem1.LoggingSystem.src.LogLevel;
import SingletonDesignPattern.Problem1.LoggingSystem.src.Logger;

public class ModuleB implements Runnable{
    @Override
    public void run(){
        Logger logger = Logger.getInstance();
        logger.log(LogLevel.INFO,"moduleB is starting their process");
        logger.log(LogLevel.INFO,"moduleB is done their process");
    }
}
