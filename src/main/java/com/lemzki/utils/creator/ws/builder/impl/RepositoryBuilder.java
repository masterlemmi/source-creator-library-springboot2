package com.lemzki.utils.creator.ws.builder.impl;

import com.lemzki.utils.creator.ws.builder.AbstractRestBuilder;
import com.lemzki.utils.creator.ws.model.JavaSource;
import com.lemzki.utils.creator.ws.model.rest.Repository;

public class RepositoryBuilder extends AbstractRestBuilder {

    @Override
    public JavaSource build() {
        return new Repository(this);
    }

 

}