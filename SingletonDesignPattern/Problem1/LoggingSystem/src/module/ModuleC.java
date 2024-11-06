package SingletonDesignPattern.Problem1.LoggingSystem.src.module;

import SingletonDesignPattern.Problem1.LoggingSystem.src.LogLevel;
import SingletonDesignPattern.Problem1.LoggingSystem.src.Logger;

public class ModuleC implements Runnable{
    @Override
    public void run(){
        Logger logger = Logger.getInstance();
        logger.log(LogLevel.INFO,"moduleC is starting their process");
        logger.log(LogLevel.INFO,"moduleC is done their process");
    }
}
