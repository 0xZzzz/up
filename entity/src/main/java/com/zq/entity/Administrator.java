package com.zq.entity;

/**
 * 管理员
 */
public class Administrator extends BaseEntity {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码 MD5
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + ", Administrator{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
