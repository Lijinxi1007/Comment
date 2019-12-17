package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
/**
 * @author
 */
public class User {
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 密码
     */
    private String password;
    /**
     * 0：男， 1：女
     */
    private Integer gender;
    /**
     * 生日
     */
    private LocalDateTime birthday;
    /**
     * 用户电话
     */
    private String mobile;
    /**
     * 用户积分
     */
    private Integer rebate;
    /**
     * 用户头像图片
     */
    private String avatar;
    /**
     * 最后一次登录时间
     */
    private LocalDateTime lastLoginTime;
    /**
     * 最后一次登录IP
     */
    private String lastLoginIp;
    /**
     * 用户级别
     */
    private Integer userLevel;
    /**
     * 微信Open ID
     */
    private String wxOpenId;
    /**
     * 微信会话Key
     */
    private String sessionKey;
    /**
     * 用户权限id
     */
    private Integer roleId;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;
}
