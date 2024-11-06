package SingletonDesignPattern.Problem1.LoggingSystem.src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger{
    private static Logger instance;
    private static final Object lock = new Object();
    private PrintWriter writer;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Logger(){
        try {
            writer = new PrintWriter(new FileWriter("logs.txt",true),true);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance(){
        if(instance == null){
            synchronized (lock) {
                if(instance==null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(LogLevel level,String message){
        String timestamp = LocalDateTime.now().format(formatter);
        writer.println("[" + timestamp + "] " + level + ": " + message);
    }
    public void close() {
        writer.close();
    }
}