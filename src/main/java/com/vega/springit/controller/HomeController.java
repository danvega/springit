package com.vega.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping( path = "/", produces = "application/json; charset=UTF-8", headers = {"foo=foo"})
    public String home() {
        return "Hello, World!";
    }

}
