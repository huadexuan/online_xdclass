package net.xdclass.online_xdclass.config;

import net.xdclass.online_xdclass.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author hdx
 * @title: InterceptorConfig
 * @projectName online_xdclass
 * @description: TODO
 * @date 2022/2/2522:00
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {


    @Bean
    LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //拦截全部
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/api/v1/pri/*/*/**");
                //不拦截哪些路径   斜杠一定要加
//                .excludePathPatterns("/api/v1/pri/user/login","/api/v1/pri/user/register");

//        WebMvcConfigurer.super.addInterceptors(registry);

    }
}
