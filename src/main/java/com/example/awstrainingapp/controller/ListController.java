package com.example.awstrainingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.awstrainingapp.bean.Message;
import com.example.awstrainingapp.service.MessageService;


@Controller
public class ListController {
    @Autowired
    MessageService helloService;
    
    @RequestMapping("/list")
    public String list(Model model) {
        List<Message> messages = helloService.messages();
        model.addAttribute("messages", messages);
        return "list";
    }

    @PostMapping("/add")
    public String addMessage(Message message) {
        helloService.insertMessage(message.getMsg());
        return "redirect:/list";
    }
    
}
