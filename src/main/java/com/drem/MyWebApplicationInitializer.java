package com.drem;

import com.drem.Filter.MyFilter;
import com.drem.Listener.MyServletContextListener;
import com.drem.servlet.MyServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.*;
import java.util.EnumSet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {


    public void onStartup(ServletContext servletContext) throws ServletException {
       System.out.println("onStartup.........");
       //注册servlet
        ServletRegistration.Dynamic servlet = servletContext.addServlet("myServlet", new MyServlet());
        servlet.addMapping("/my");
        //注册listener
        servletContext.addListener(MyServletContextListener.class);
        //注册filter
        FilterRegistration.Dynamic filter = servletContext.addFilter("myFilter", new MyFilter());
        filter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
    }
}
