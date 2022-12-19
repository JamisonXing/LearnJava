package com.jamison.spi;

/**
 * @author jamison
 */
public class Main {
    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getLoggerService();
        loggerService.info("Hello SPI");
        loggerService.debug("Hello SPI");
    }
}
