package com.example.jersey.security;

import com.example.jersey.data.DataConfiguration;
import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(1)
public class DemoSecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public DemoSecurityWebApplicationInitializer() {
        super(DataConfiguration.class, SecurityConfig.class);
    }
    @Override
    public void afterSpringSecurityFilterChain(javax.servlet.ServletContext servletContext) {
        // Set the Jersey used property to it won't load a ContextLoaderListener
        servletContext.setInitParameter("contextConfigLocation", "NOOP");
    }
}
