package com.schoolForum.schoolForum.user.dao;

import com.schoolForum.schoolForum.user.vo.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {

    List<UserVo> queryUser(@Param("userVo") UserVo userVo);

    Integer updateUser(@Param("userVo") UserVo userVo);
}
