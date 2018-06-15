package com.lemzki.utils.creator.ws.model.rest;

import com.lemzki.utils.creator.ws.builder.RestBuilderData;
import com.lemzki.utils.creator.ws.builder.impl.RestControllerBuilder;

public class Repository extends AbstractRestModel {

    public Repository(RestBuilderData sourceBuilder) {
        super(sourceBuilder);
    }

    @Override
    public void create() {
        if (isCreateDefaultClass()) {

        }

    }

}
