package com.wu.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
    	
    	Class<?>[] classes = {AppConfig.class}; 
        return classes;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
