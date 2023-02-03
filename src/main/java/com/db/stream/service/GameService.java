package com.db.stream.service;

import com.db.stream.entity.User;
import com.db.stream.entity.Game;
import com.db.stream.mapper.UserMapper;
import com.db.stream.mapper.GameMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.io

@Service
public class GameService {

    @Resource
    private GameMapper gameMapper;
    public List<Game> getGameInfo(){

        //Map<String, Object> resultMap = new HashMap<>();

        List<Game> gameList = gameMapper.getGameInfo();

        return gameList;

    }

}
