package com.lemzki.utils.creator.ws.builder;

import com.lemzki.utils.creator.ws.builder.SourceBuilder;

public interface WebServiceBuilder {

    
    
    /** creates  all layers (controller, model (if not exists), service, and repo
     * @return RestServiceBuilder that builds all layers
     */
    SourceBuilder createRestServiceLayers();
    
    
    /** creates rest conroller layer based on common conventions for rest
     * @return a Builder to create the restController
     */
    SourceBuilder createRestController();

    /**  creates service layer based on common conventions for rest
     * @return a Builder to create the service layer
     */
    SourceBuilder createService();
    
    
    /**  creates repository layer based on common conventions for rest
     * @return a Builder to create the service layer
     */
    SourceBuilder createRepository();
    
    
   

   
}
