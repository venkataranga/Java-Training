package com.spring.rest.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoadServletConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
	
		System.out.println("loading dispatcher servlet");
		AnnotationConfigWebApplicationContext annotationConfig = new AnnotationConfigWebApplicationContext();
		annotationConfig.register(SpringBeansConfiguration.class);
		
		DispatcherServlet restDispatcher = new DispatcherServlet(annotationConfig);
		
		ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("restServelt", restDispatcher);
		dispatcherServlet.addMapping("/");
		dispatcherServlet.setLoadOnStartup(1);
		
		
	}

}
