package com.db.stream.controller;
import com.db.stream.entity.Game;
import com.db.stream.service.GameService;
import jakarta.annotation.Resource;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {
    @Resource
    private GameService gameService;

    @GetMapping ("/home")
    public List<String> showHomepage(){
        System.out.println("get all game name, proceeding...\n");
        return gameService.getAllGame();
    }


    @GetMapping("/lib")
    public List<Game> libGameList(@RequestParam Integer u_id){
        return gameService.getUserGame(u_id);
    }

}
