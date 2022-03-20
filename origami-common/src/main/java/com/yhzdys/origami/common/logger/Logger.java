package com.yhzdys.origami.common.logger;

public interface Logger {

    void debug(String message);

    void debug(Throwable throwable);

    void debug(String message, Throwable throwable);

    void info(String message);

    void info(Throwable throwable);

    void info(String message, Throwable throwable);

    void warn(String message);

    void warn(Throwable throwable);

    void warn(String message, Throwable throwable);

    void error(String message);

    void error(Throwable throwable);

    void error(String message, Throwable throwable);

    boolean isDebugEnabled();

    boolean isInfoEnabled();

    boolean isWarnEnabled();

    boolean isErrorEnabled();

}