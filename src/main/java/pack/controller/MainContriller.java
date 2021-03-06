package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pack.model.User;
import pack.service.MailService;


public class MainContriller {

    @Autowired
    private MailService mailService;

//    @GetMapping("/")
//    public String add(@AuthenticationPrincipal User authUser, Model model){
//        model.addAttribute("user", authUser);
//        return "index";
//    }

    @GetMapping("/mail")
    public String sendMail(@AuthenticationPrincipal User authUser){
        mailService.sendSimpleEmail("akbp@mail.ru","sub","hello from "+authUser.getUsername());
        return "index";
    }

}
