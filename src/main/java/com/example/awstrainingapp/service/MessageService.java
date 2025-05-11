package com.example.awstrainingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.awstrainingapp.bean.Message;
import com.example.awstrainingapp.mapper.MessageMapper;

@Service
public class MessageService {
    @Autowired
    MessageMapper messageMapper;

    public List<Message> messages() {
        return messageMapper.selectMessage();
    }

    @Transactional
    public int insertMessage(String msg) {
        return messageMapper.insertMessage(msg);
    }
}
