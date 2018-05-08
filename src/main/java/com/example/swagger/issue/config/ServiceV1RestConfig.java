package com.example.swagger.issue.config;


import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath(PathConstants.SERVICE_V1_ROOT_PATH)
public class ServiceV1RestConfig extends ResourceConfig {

    public ServiceV1RestConfig() {
        this.packages("com.example.swagger.issue.controller.v1");
        this.register(OpenApiResource.class);
    }
}
