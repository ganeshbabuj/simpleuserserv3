package com.example.simpleuserserv3;

import com.example.simpleuserserv3.entity.UserEntity;
import com.example.simpleuserserv3.resource.User;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Simpleuserserv3Application {

    public static void main(String[] args) {
        SpringApplication.run(Simpleuserserv3Application.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(User.class, UserEntity.class).addMappings(mapper -> {
            mapper.skip(UserEntity::setGroups);
        });
        return modelMapper;
    }


}
