package com.drem.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("MyServletContextListener........contextInitialized..");

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("MyServletContextListener........contextDestroyed..");
    }
}
