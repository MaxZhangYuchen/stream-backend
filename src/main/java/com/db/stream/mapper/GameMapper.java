package com.db.stream.mapper;

import com.db.stream.entity.User;
import com.db.stream.entity.Game;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

import java.util.List;
@Mapper
public interface GameMapper {
    /*@Select("SELECT u_name, u_email, u_pwd, u_permission FROM User WHERE u_email = #{email}")
    List<User> selectUserByEmail(@Param("email") String email);

    @Insert("INSERT INTO User(u_name, u_email, u_pwd)" + "VALUE(#{u_name}, #{u_email}, #{u_pwd})")
    Integer createAccount(User user);*/

    @Select("SELECT g_id,g_name,g_intro,g_price FROM Game")
    List<Game> getGameInfo();

}
