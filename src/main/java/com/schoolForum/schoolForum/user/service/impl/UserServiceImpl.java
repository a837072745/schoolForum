package com.schoolForum.schoolForum.user.service.impl;

import com.schoolForum.schoolForum.user.dao.IUserDao;
import com.schoolForum.schoolForum.user.service.IUserService;
import com.schoolForum.schoolForum.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDao user;

    @Override
    public List<UserVo> queryUser(UserVo userVo) {
        return user.queryUser(userVo);
    }
}
