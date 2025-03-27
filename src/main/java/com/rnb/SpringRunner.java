package com.rnb;


import com.rnb.database.repository.UserRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");

        UserRepository userRepository = xmlApplicationContext.getBean("userRepository1", UserRepository.class);

        System.out.println(userRepository);

        xmlApplicationContext.close();
    }
}
