package com.yhzdys.origami.common.logger.log4j;

import com.yhzdys.origami.common.logger.Level;
import com.yhzdys.origami.common.logger.Logger;
import com.yhzdys.origami.common.logger.LoggerAdapter;

import java.io.File;

public class Log4jLoggerAdapter implements LoggerAdapter {

    @Override
    public Logger getLogger(Class<?> key) {
        return null;
    }

    @Override
    public Logger getLogger(String key) {
        return null;
    }

    @Override
    public Level getLevel() {
        return null;
    }

    @Override
    public void setLevel(Level level) {

    }

    @Override
    public File getFile() {
        return null;
    }

    @Override
    public void setFile(File file) {

    }
}
