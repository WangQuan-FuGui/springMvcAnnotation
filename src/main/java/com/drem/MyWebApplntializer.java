package com.drem;

import com.drem.config.AppConfig;
import com.drem.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//web容器启动的时候创建对象；调用方法来初始化容器以及前端控制器
public class MyWebApplntializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 获取根容器的配置类：（spring的配置文件)父容器;
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 获取web容器的配置类(SprinngMvc配置文件) 子容器;
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    /**
     * 获取DispatcherServlet的映射信息
     *   /:拦截所有请求（包括静态资源(xx.js,xx.png));当是不包括.jsp
     *   /*:拦截所有请求包括*.jsp
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
