package com.jamison.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author jamison
 */
public class LoggerService {
    private static final LoggerService SERVICE = new LoggerService();

    private final Logger logger;

    private final List<Logger> loggerList;

    private LoggerService() {
        ServiceLoader<Logger> loader = ServiceLoader.load(Logger.class);
        List<Logger> list = new ArrayList<>();
        for (Logger log : loader) {
            list.add(log);
        }
        //loggerList是所有的ServiceLoader
        loggerList = list;
        if(!list.isEmpty()) {
            //Logger只取一个
            logger = list.get(0);
        }else {
            logger = null;
        }
    }

    public static LoggerService getLoggerService() {
        return SERVICE;
    }

    public void info(String msg) {
        if(logger == null) {
            System.out.println("info中没有发现服务提供者");
        }else {
            logger.info(msg);
        }
    }

    public void debug(String msg) {
        if(loggerList == null) {
            System.out.println("debug中没有发现服务提供者");
        }
        loggerList.forEach(log -> log.debug(msg));
    }
}
