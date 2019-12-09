package com.dlion.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzy
 * @Date 2019/12/9 10:39
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("{id}")
    public Object item(@PathVariable Integer id) {

        return "this is item id :" + id;
    }

}
