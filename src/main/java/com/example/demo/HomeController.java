package com.example.demo;

import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @FXML
    void initialize(){
        System.out.println("Hello from Home");
    }

    @FXML
    void onClick(){
        // fetch all Users
        System.out.println("Users found with findAll():");
        for (User User : userRepository.findAll()) {
            System.out.println(User.getName());
        }

        // fetch one user
        // NOTE: if the query returns no value the object returned will be null (u.getName would crash)
        User u = userRepository.findByEmail("Palmer");
        System.out.println(u.getName());

        /*
        To get rid of the log
        2019-03-18 12:06:06.689  INFO 11696 --- [lication Thread] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
        See: https://stackoverflow.com/questions/11639997/how-do-you-configure-logging-in-hibernate-4-to-use-slf4j/27482790#27482790
        This is however extremely unimportant and a waste of your time.
         */
    }
}
