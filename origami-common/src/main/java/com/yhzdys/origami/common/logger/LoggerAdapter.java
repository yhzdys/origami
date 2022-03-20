package com.yhzdys.origami.common.logger;

import java.io.File;

public interface LoggerAdapter {

    Logger getLogger(Class<?> key);

    Logger getLogger(String key);

    Level getLevel();

    void setLevel(Level level);

    File getFile();

    void setFile(File file);

}