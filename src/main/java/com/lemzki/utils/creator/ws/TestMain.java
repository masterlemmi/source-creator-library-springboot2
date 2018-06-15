package com.lemzki.utils.creator.ws;

import com.lemzki.utils.creator.ws.builder.WebServiceBuilder;
import com.lemzki.utils.creator.ws.impl.WebServiceBuilderImpl;
import com.lemzki.utils.creator.ws.model.JavaSource;
import com.lemzki.utils.creator.ws.model.SampleModel;

public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException {
        WebServiceBuilder builder = new WebServiceBuilderImpl();

        JavaSource jsource = builder.createRestServiceLayers().fromClass("Tamagotchi")
                .onPackage("com.lemzki.utils.creator.ws.test").build();
        jsource.create();

        JavaSource jsource2 = builder.createRepository().fromClass(SampleModel.class).build();
        jsource2.create();

        JavaSource jsource3 = builder.createRestController().fromClass(SampleModel.class).build();
        jsource3.create();

    }

}
