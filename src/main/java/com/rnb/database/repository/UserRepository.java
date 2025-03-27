package com.rnb.database.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@ToString
public class UserRepository {
    private String userName;
    private int poolSize;
    private List<Object> args;
    private Map<String, Object> properties;

    @PostConstruct
    public void init() {
        System.out.println("init userRepository");
    }

    //destroy method runs only when call method close() of the context class
    @PreDestroy
    public void destroy() {

        System.out.println("destroy userRepository");
    }
}
