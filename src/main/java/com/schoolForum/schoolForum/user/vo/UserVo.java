package com.schoolForum.schoolForum.user.vo;

public class UserVo {
    private Long userId;
    private String userName;
    private String password;
    private String userSex;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "userId = " + userId + ", userName = " + userName + ", userSex = " + userSex;
    }
}
