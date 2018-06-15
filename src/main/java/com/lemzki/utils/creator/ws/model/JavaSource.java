package com.lemzki.utils.creator.ws.model;

import java.io.IOException;

public interface JavaSource {

    void create() throws IOException;
    
    String getWriteLocation();
    
    String getSourceCode();
}
