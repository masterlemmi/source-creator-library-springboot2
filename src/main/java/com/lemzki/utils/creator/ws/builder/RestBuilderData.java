package com.lemzki.utils.creator.ws.builder;

import com.lemzki.utils.creator.ws.model.EntityModel;

public interface RestBuilderData {

    public Class<? extends EntityModel> getModel();

    public String getPackageName();

    public String getClassName();

    public boolean isCreateDefaultClass() ;
}
