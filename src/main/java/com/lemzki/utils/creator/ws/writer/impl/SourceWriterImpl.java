package com.lemzki.utils.creator.ws.writer.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.lemzki.utils.creator.ws.model.JavaSource;
import com.lemzki.utils.creator.ws.writer.SourceWriter;

public class SourceWriterImpl implements SourceWriter {

    @Override
    public void write(JavaSource javaSource) throws IOException {
        String data = javaSource.getSourceCode();
        String loc = javaSource.getWriteLocation();
        write(loc, data);
        

    }

    @Override
    public void write(String sourceCode) throws IOException {
        write(new File(""), sourceCode);

    }
    
    
    @Override
    public void write(String loc, String sourceCode) throws IOException {
       write( new File(loc), sourceCode)
        
    }

    @Override
    public final void write(File absFileUrl, String data) throws IOException  {
        if (absFileUrl.isDirectory())
            throw new RuntimeException("Cannot right data to folder");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(absFileUrl));) {
            writer.write(data);
        } 
    }

  
    

}
