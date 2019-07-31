package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    int checkEmail(String email);
    //mybatis传递多个参数时，需要用@Param注解，写sql时要与@Param中的名字对应
    User selectLogin(@Param("username") String username, @Param("password")String password);

    String selectQuestionByUsername(String username);

    int checkAnswer(@Param("username")String username,@Param("question")String question,@Param("answer")String answer);

    int updatePasswordByUsername(@Param("username")String username,@Param("passwordNew")String passwordNew);

    int checkPassword(@Param(value="password")String password,@Param("userId")Integer userId);

    int checkEmailByUserId(@Param(value="email")String email,@Param(value="userId")Integer userId);
}