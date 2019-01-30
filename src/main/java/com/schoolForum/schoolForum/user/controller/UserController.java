package com.schoolForum.schoolForum.user.controller;

import com.schoolForum.schoolForum.user.service.IUserService;
import com.schoolForum.schoolForum.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/userInfo")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/queryUser")
    public String queryUser(UserVo userVo, Model model){
        List<UserVo> userVoList = userService.queryUser(userVo);
        if (userVoList != null && userVoList.size() > 0) {
            return "html/main";
        } else {
            model.addAttribute("userVo", new UserVo());
            return "html/login";
        }
    }

}
