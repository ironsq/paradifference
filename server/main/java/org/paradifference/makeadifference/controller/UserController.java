package org.paradifference.makeadifference.controller;


import org.paradifference.makeadifference.entity.User;
import org.paradifference.makeadifference.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @CrossOrigin
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> user = userService.findAllUsers();

        if(user.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable("id") long id){

        User user = userService.findById(id);

        if(user == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @RequestMapping(value = "/users/", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody User user){

        if(userService.UserExist(user)){
            return new ResponseEntity(HttpStatus.CONFLICT);
        }

        userService.createUser(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") long id, @RequestBody User userModel){

        User currentUser = userService.findById(id);

        if(currentUser == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }

        currentUser.setEmail(userModel.getEmail());
        currentUser.setPassword(userModel.getPassword());

        userService.updateUser(currentUser);
        return new ResponseEntity<>(currentUser, HttpStatus.OK);
    }


    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable("id") long id){

        User user = userService.findById(id);

        if(user == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
