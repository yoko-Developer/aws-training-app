package com.example.awstrainingapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.awstrainingapp.bean.Message;

@Mapper
public interface MessageMapper {
    @Select("SELECT * FROM t_msg")
    List<Message> selectMessage();
    @Insert("INSERT INTO t_msg (msg) VALUES (#{msg})")
    int insertMessage(String msg);
}
