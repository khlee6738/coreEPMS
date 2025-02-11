package com.newlecture.web;


//Spring Boot가 내장 톰캣 서버에서 JSP를 올바르게 처리하도록 설정하려면 
//SpringBootServletInitializer를 확장하는 클래스를 추가해야 합니다. 
//이를 통해 Spring Boot 애플리케이션을 서블릿 컨테이너에서 실행할 수 있게 됩니다.
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CoreEpmsApplication.class);
    }
}

