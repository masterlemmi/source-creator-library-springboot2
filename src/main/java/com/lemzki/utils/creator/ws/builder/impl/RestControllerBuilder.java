package com.lemzki.utils.creator.ws.builder.impl;

import com.lemzki.utils.creator.ws.builder.AbstractRestBuilder;
import com.lemzki.utils.creator.ws.model.JavaSource;
import com.lemzki.utils.creator.ws.model.rest.RestController;
import com.lemzki.utils.creator.ws.writer.params.RestParams;

public class RestControllerBuilder extends AbstractRestBuilder {
    
    @Override
    public JavaSource build() {
        RestParams restParams = new RestParams(this);
        return new RestController(restParams);
        
    }

}