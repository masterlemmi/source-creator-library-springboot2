package com.lemzki.utils.creator.ws.model.rest;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import com.lemzki.utils.creator.ws.model.JavaSource;
import com.lemzki.utils.creator.ws.writer.SourceWriter;
import com.lemzki.utils.creator.ws.writer.impl.SourceWriterImpl;
import com.lemzki.utils.creator.ws.writer.params.RestParams;
import com.lemzki.utils.creator.ws.writer.params.Template;

public class RestController implements JavaSource {
    private static final String TEMPLATE = "RestController.template";
    private final String writeLocation;
    private final String sourceCode;

    public RestController(RestParams params) {
        this.writeLocation = params.getWriteLocation();
        this.sourceCode = getTemplate().performReplace(params.getReplaceParams());
    }

    @Override
    public String getWriteLocation() {
        return this.writeLocation;
    }

    @Override
    public String getSourceCode() {
        return this.sourceCode;
    }

    @Override
    public void create() throws IOException {
        SourceWriter swriter = new SourceWriterImpl();
        swriter.write(this);
    }

    private Template getTemplate() {

        String sourceCode = "";

        ClassLoader classLoader = getClass().getClassLoader();
        try {
            sourceCode = IOUtils.toString(classLoader.getResourceAsStream(TEMPLATE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return  new Template(TEMPLATE, sourceCode);
    }

   

}
