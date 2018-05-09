package com.itmuch.cloud.microservicesimpleprovieruser.controller;

import com.itmuch.cloud.microservicesimpleprovieruser.dao.UserRepository;
import com.itmuch.cloud.microservicesimpleprovieruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: rest
 * @author: lin2cy
 * @createTime: 2018/5/8 11:36
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne = this.userRepository.findOne(id);
        return findOne;
    }


}
