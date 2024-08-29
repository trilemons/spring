package com.lml.spring.biz;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"com.lml.spring.biz","com.lml.spring.service"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
