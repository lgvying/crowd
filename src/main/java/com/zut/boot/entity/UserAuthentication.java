package com.zut.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 梁贵莹
 * @create 2021/6/25 上午 10:22
 * 个人认证表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tab_user_authentication")
public class UserAuthentication implements Serializable {
    /**
     * 认证id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_authenticationId")
    private Integer userAuthenticationId;
    /**
     * 用户真实姓名
     */
    @Column(name = "real_name")
    private String realName;
    /**
     * 身份证号码
     */
    @Column(name = "ID_number")
    private String IDNumber;
    /**
     * 身份证图片
     */
    @Column(name = "ID_photo")
    private String IDPhoto;
    /**
     * 用户认证状态 0 未认证 1 认证
     */
    @Column(name = "user_authentication_status")
    private Integer userAuthenticationStatus;



}
