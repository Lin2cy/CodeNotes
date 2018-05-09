package com.file.golefile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lin2cy
 * @createTime: 2018/4/24 15:49
 */
@RestController
public class HomeController {

    @RequestMapping("/he")
    public Object home(){
        return "hello word";
    }

    @RequestMapping("write")
    public Object write(){

        return null;
    }
}
