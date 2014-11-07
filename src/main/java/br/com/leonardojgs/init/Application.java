package br.com.leonardojgs.init;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Application implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));
        
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
        
//		FilterRegistration.Dynamic fr = servletContext.addFilter("hiddenHttpMethodFilter", new HiddenHttpMethodFilter());
//		fr.addMappingForUrlPatterns(null, true, "/*");
//		fr = servletContext.addFilter("encodingFilter", new CharacterEncodingFilter());
//		fr.setInitParameter("encoding", "UTF-8");
//		fr.setInitParameter("forceEncoding", "true");
//		fr.addMappingForUrlPatterns(null, true, "/*");
		
		ServletRegistration.Dynamic appServlet = servletContext.addServlet("appServlet", new DispatcherServlet(context));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");
		
		OpenEntityManagerInViewFilter openEntityManagerInViewFilter = new OpenEntityManagerInViewFilter();
		openEntityManagerInViewFilter.setEntityManagerFactoryBeanName("localEntityManagerFactory");
		
		Dynamic dynamic = servletContext.addFilter("openEntityManagerInViewFilter", openEntityManagerInViewFilter);
		dynamic.addMappingForUrlPatterns(getDispatcherTypes(), false, "/");
	}
	
	private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("br.com.leonardojgs.configuration");
        return context;
    }
	
	private EnumSet<DispatcherType> getDispatcherTypes() {
		return EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.ASYNC);
	}

//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		return new Class<?>[] { CoreConfiguration.class };
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return new Class<?>[] { WebConfiguration.class };
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		return new String[] { "/" };
//	}
//	
//	@Override
//	protected Filter[] getServletFilters() {
//		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//		characterEncodingFilter.setEncoding("UTF-8");
//        characterEncodingFilter.setForceEncoding(true);
//        
//        OpenSessionInViewFilter openSessionInViewFilter = new OpenSessionInViewFilter();
//        
//        return new Filter[] {characterEncodingFilter, openSessionInViewFilter};
//	}
//
//    @Override
//    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//        registration.setInitParameter("defaultHtmlEscape", "true");
//        registration.setInitParameter("spring.profiles.active", "default");
//    }

}
