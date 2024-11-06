package SingletonDesignPattern.Problem1.LoggingSystem.src;

import SingletonDesignPattern.Problem1.LoggingSystem.src.module.ModuleA;
import SingletonDesignPattern.Problem1.LoggingSystem.src.module.ModuleB;
import SingletonDesignPattern.Problem1.LoggingSystem.src.module.ModuleC;

public class Main{
    public static void main(String[] args) {
        Thread ModuleA = new Thread(new ModuleA());
        Thread ModuleB = new Thread(new ModuleB());
        Thread ModuleC = new Thread(new ModuleC());

        ModuleA.start();
        ModuleB.start();
        ModuleC.start();
    }
}