package com.game.littlegame.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unsec")
public class UnsecuredController {

    @GetMapping
    public String unsecContr(){
        return "UNSECIRED FUCK OFF!!!";
    }
}
