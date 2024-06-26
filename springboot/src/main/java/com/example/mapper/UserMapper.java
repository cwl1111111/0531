package com.example.mapper;

import com.example.controller.request.BaseRequest;
import com.example.controller.request.UserPageRequest;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;
@Mapper
public interface UserMapper {

    //@Select("select * from user")
    List<User> list();


    List<User> listByCondition(BaseRequest baseRequest);

    void save(User user);

    User getById(Integer id);

    void updateById(User user);

    void deleteById(Integer id);
}
