package com.example.swagger.issue.config;


import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath(PathConstants.SERVICE_V0_ROOT_PATH)
public class ServiceV0RestConfig extends ResourceConfig {

    public ServiceV0RestConfig() {
        this.packages("com.example.swagger.issue.controller.v0");
        this.register(OpenApiResource.class);
    }
}
