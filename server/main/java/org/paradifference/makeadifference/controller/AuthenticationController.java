package org.paradifference.makeadifference.controller;


import org.paradifference.makeadifference.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017-02-03.
 */
@RestController
public class AuthenticationController {
    @GetMapping("/login")
    public void login() {

    }

    @PostMapping("/login")
    public ResponseEntity<User> authenticate() {
        System.out.println("auth");
        return null;
    }
}
