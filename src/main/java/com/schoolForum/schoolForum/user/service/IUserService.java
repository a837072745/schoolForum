package com.schoolForum.schoolForum.user.service;

import com.schoolForum.schoolForum.user.vo.UserVo;

import java.util.List;

public interface IUserService {
    List<UserVo> queryUser(UserVo userVo);
}
