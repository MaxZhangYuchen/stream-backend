package com.db.stream.entity;
import java.util.Date;

public class Game {

    private Integer g_id;

    private String g_name;

    private String g_intro;

    private Date g_release_date;

    private Double g_price;

    private String g_tag;

    private Integer com_id;

    private Integer g_volumn;

    private Double g_income;

    private Double g_rate;

    public Game(){

    }

    public Integer get_gid(){ return g_id;}

}
