package com.lemzki.utils.creator.ws.impl;

import com.lemzki.utils.creator.ws.builder.SourceBuilder;
import com.lemzki.utils.creator.ws.builder.WebServiceBuilder;
import com.lemzki.utils.creator.ws.builder.impl.RepositoryBuilder;
import com.lemzki.utils.creator.ws.builder.impl.RestControllerBuilder;
import com.lemzki.utils.creator.ws.builder.impl.RestLayersBuilder;
import com.lemzki.utils.creator.ws.builder.impl.ServiceBuilder;

public class WebServiceBuilderImpl implements WebServiceBuilder {
    
    @Override
    public SourceBuilder createRestServiceLayers() {
        return new RestLayersBuilder();
    }

    @Override
    public SourceBuilder createRestController() {
        return new RestControllerBuilder();
    }

    @Override
    public SourceBuilder createService() {
        return new ServiceBuilder();
    }

    @Override
    public SourceBuilder createRepository() {
        return new RepositoryBuilder();
    }

   
    }

}
