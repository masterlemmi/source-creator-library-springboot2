package com.lemzki.utils.creator.ws.writer;

import java.io.File;
import java.io.IOException;

import com.lemzki.utils.creator.ws.model.JavaSource;

public interface SourceWriter {
    
    void write (JavaSource javaSource) throws IOException;

    void write(String sourceCode, String loc) throws IOException;

    void write (String sourceCode) throws IOException;
    

    void write(File absFileUrl, String data) throws IOException;
}
