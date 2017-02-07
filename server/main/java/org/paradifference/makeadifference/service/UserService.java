package org.paradifference.makeadifference.service;


import org.paradifference.makeadifference.entity.User;
import org.paradifference.makeadifference.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){ return userRepository.findAll();}

    public User findById(Long id){return userRepository.findOne(id);}

    public Boolean UserExist(User user){return userRepository.equals(user);}

    public void updateUser(User user){userRepository.saveAndFlush(user);}

    public void deleteUserById(Long id){userRepository.delete(id);}

    public void createUser(User user){userRepository.saveAndFlush(user);}
}
