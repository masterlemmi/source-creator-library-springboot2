package com.lemzki.utils.creator.ws.writer.params;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

import org.apache.commons.text.WordUtils;

import com.lemzki.utils.creator.ws.builder.RestBuilderData;
import com.lemzki.utils.creator.ws.model.EntityModel;

//list of parameters that will be replaced in the template file
public class RestParams {
    private static final String MODEL_NAME = "{ModelName}";
    private static final String MODEL_NAME_L = "{modelName}";
    private static final String CLASS_PKG = "{class.package}";
    private static final String MODEL_PKG = "{model.package}";

    private String modelName;
    private String classPkg;
    private String modelPackage;

    public RestParams(RestBuilderData sourceBuilder) {
        boolean createDefaultClass = sourceBuilder.isCreateDefaultClass();

        Class<? extends EntityModel> clazz = sourceBuilder.getModel();

        if (createDefaultClass) {
            // use string to create generic model
            this.modelName = sourceBuilder.getClassName();
            this.modelPackage = "";
        } else {
            this.modelName = clazz.getSimpleName();
            this.modelPackage = clazz.getName();
        }

        this.classPkg = sourceBuilder.getPackageName();

    }

    public String getWriteLocation() {
        if (this.classPkg != null) {
            return replaceDotsWithSlash(this.classPkg);
        }
        return null;
    }

    public Map<String, String> getReplaceParams() {
        Map<String, String> params = new HashMap<>();
        params.put(MODEL_NAME, modelName);
        params.put(MODEL_NAME_L, toCamelCase(modelName));
        params.put(CLASS_PKG, classPkg);
        params.put(MODEL_PKG, modelPackage);

        return params;

    }

    private String replaceDotsWithSlash(String packageName) {
        return packageName.replaceAll("\\.", Matcher.quoteReplacement("/"));
    }

    private String toCamelCase(String name) {
        String capitalized = WordUtils.capitalizeFully(name);
        return WordUtils.capitalize(capitalized.substring(0, 1)) + capitalized.substring(1);
    }

}
