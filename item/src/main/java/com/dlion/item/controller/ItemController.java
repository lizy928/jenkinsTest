package com.dlion.item.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzy
 * @Date 2019/12/9 10:36
 */
@RestController
@RequestMapping("/api/item")
public class ItemController {

    @GetMapping("{id}")
    public Object user(@PathVariable Integer id) {

        return "welcome user Id: " + id;
    }

}
