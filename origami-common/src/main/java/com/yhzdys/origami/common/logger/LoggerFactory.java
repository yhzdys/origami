package com.yhzdys.origami.common.logger;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * logger factory
 */
public class LoggerFactory {

    private static final Map<String, Logger> _cache = new ConcurrentHashMap<>();
    private static volatile LoggerAdapter loggerAdapter;

    static {
        String logger = System.getProperty("origami.logger", "");
        switch (logger) {
            case "log4j":
                // TODO setLoggerAdapter();
                break;
            case "log4j2":
                // TODO setLoggerAdapter();
                break;
            case "slf4j":
                // TODO setLoggerAdapter();
                break;
            default:
                // TODO setLoggerAdapter();
                break;
        }
    }

    public static void setLoggerAdapter(LoggerAdapter adapter) {
        if (adapter == null) return;
        Logger logger = adapter.getLogger(LoggerFactory.class);
        LoggerFactory.loggerAdapter = adapter;
        logger.info("using logger: " + adapter.getClass().getSimpleName());
    }

    public static Logger getLogger(Class<?> clazz) {
        return _cache.computeIfAbsent(clazz.getName(), loggerName -> loggerAdapter.getLogger(loggerName));
    }

    public static Logger getLogger(String name) {
        return _cache.computeIfAbsent(name, loggerName -> loggerAdapter.getLogger(loggerName));
    }

}
