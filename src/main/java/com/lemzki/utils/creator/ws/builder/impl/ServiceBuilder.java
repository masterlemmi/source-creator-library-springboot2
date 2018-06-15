package com.lemzki.utils.creator.ws.builder.impl;

import com.lemzki.utils.creator.ws.builder.AbstractRestBuilder;
import com.lemzki.utils.creator.ws.model.JavaSource;
import com.lemzki.utils.creator.ws.model.rest.Service;

public class ServiceBuilder extends AbstractRestBuilder {

    @Override
    public JavaSource build() {
        return new Service(this);
    }
  

}