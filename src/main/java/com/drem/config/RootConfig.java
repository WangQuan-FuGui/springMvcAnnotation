package com.drem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
//spring的容器不扫描Controller ；父容器

@ComponentScan(value = "com.drem",excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class})
})
public class RootConfig {

}
