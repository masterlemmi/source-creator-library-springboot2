package com.lemzki.utils.creator.ws.builder;

import com.lemzki.utils.creator.ws.model.EntityModel;
import com.lemzki.utils.creator.ws.model.JavaSource;

public interface SourceBuilder {

    // create controller based on content of class
    SourceBuilder fromClass(Class<? extends EntityModel> clazz);
    
    //find class with givenName;
    SourceBuilder fromClass(String className) throws ClassNotFoundException;

    // create default class from given String as class name
    SourceBuilder usingDefaultClass(String className);

    // place created controllers on package otherwise creator on main src
    SourceBuilder onPackage(String packageName);
    
    //write the corresponding resource on the given package
    JavaSource build();
    
    
    

}