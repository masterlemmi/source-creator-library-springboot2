package com.lemzki.utils.creator.ws.builder;

import com.lemzki.utils.creator.ws.model.EntityModel;
import com.lemzki.utils.creator.ws.model.JavaSource;

public abstract class AbstractRestBuilder  implements SourceBuilder, RestBuilderData {
    private Class<? extends EntityModel> model;
    private String packageName;
    private String className;
    private boolean createDefaultClass;

    @Override
    public AbstractRestBuilder fromClass(Class<? extends EntityModel> clazz) {
        this.model = clazz;
        this.createDefaultClass = false;
        this.className = clazz.getName();
        return this;
    }

    @Override
    public AbstractRestBuilder usingDefaultClass(String className) {
        this.model = null;
        this.createDefaultClass = true;
        this.className = className;
        return this;
    }

    @Override
    public AbstractRestBuilder onPackage(String packageName) {
        this.packageName = packageName;
        return this;
    }

    @Override
    public AbstractRestBuilder fromClass(String className) throws ClassNotFoundException {
        Class clazz = Class.forName(className);
        return fromClass(clazz);
    }
    
    public final Class<? extends EntityModel> getModel() {
        return model;
    }

    public final String getPackageName() {
        return packageName;
    }

    public final String getClassName() {
        return className;
    }

    public final boolean isCreateDefaultClass() {
        return createDefaultClass;
    }


    @Override
    public abstract JavaSource build();

}