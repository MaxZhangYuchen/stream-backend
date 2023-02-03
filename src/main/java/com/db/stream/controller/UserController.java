package com.db.stream.controller;

import com.db.stream.entity.User;
import com.db.stream.entity.Game;
import com.db.stream.service.UserService;
import com.db.stream.service.GameService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.util.Map;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private GameService gameService;



    @PostMapping(value = "/sign-in")
    public Map<String, Object> loginAccount(@RequestBody User user){
        return userService.loginAccount(user);
    }

    @PostMapping("/sign-up")
    public Map<String, Object> createAccount(@RequestBody User user){
        return userService.createAccount(user);
    }

    @PostMapping("/game_show")
    public List<Game> game_show() { return gameService.getGameInfo();}
}
