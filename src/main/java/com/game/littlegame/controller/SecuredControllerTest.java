package com.game.littlegame.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredControllerTest {

    @GetMapping("/")
    public String first(){
        return "SECIRED FUCK OFF!!!";
    }
}
