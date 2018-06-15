package com.lemzki.utils.creator.ws.builder.impl;

import com.lemzki.utils.creator.ws.builder.AbstractRestBuilder;
import com.lemzki.utils.creator.ws.model.JavaSource;
import com.lemzki.utils.creator.ws.model.rest.WebServiceSource;

public class RestLayersBuilder  extends AbstractRestBuilder  {

    @Override
    public JavaSource build() {
        return new WebServiceSource(this);
    }
    

}