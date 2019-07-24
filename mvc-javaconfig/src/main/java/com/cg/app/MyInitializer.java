package com.cg.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class MyInitializer implements WebApplicationInitializer{
        @Override
        public void onStartup(ServletContext container) throws ServletException {
            AnnotationConfigWebApplicationContext context = 
                    new AnnotationConfigWebApplicationContext();
       		context.setServletContext(container);
            context.register(AppConfig.class);
            container.addListener(new ContextLoaderListener());	
        }
        
    }