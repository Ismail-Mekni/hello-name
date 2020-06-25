package com.ismail.helloname.configurations;

import com.ismail.helloname.business.HelloNameBusiness;
import com.ismail.helloname.repositories.HelloNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloNameConfiguration {

    @Autowired
    private HelloNameRepository helloNameRepository;

    @Bean
    public HelloNameBusiness helloNameBusiness(){
        return new HelloNameBusiness(helloNameRepository);
    }
}
