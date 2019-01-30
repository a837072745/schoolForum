package com.schoolForum.schoolForum.login.controller;

import com.schoolForum.schoolForum.user.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("userVo", new UserVo());
        return "html/login";
    }
}
