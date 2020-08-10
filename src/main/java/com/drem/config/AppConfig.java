package com.drem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.DispatcherServlet;

//springMvc只扫描Controller; 子容器
//禁用默认过滤规则useDefaultFilters = false
@ComponentScan(value = "com.drem",includeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = false)
public class AppConfig {

}
