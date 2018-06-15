package com.lemzki.utils.creator.ws.model.rest;

import com.lemzki.utils.creator.ws.builder.RestBuilderData;
import com.lemzki.utils.creator.ws.model.JavaSource;

public class WebServiceSource implements JavaSource {
    private JavaSource repo;
    private JavaSource service;
    private JavaSource controller;

    public WebServiceSource(RestBuilderData sourceBuilder) {
        this.repo = new Repository(sourceBuilder);
        this.service = new Service(sourceBuilder);
        this.controller = new RestController(sourceBuilder);
    }

    @Override
    public void create() {
       repo.create();
       service.create();
       controller.create();

    }

}
