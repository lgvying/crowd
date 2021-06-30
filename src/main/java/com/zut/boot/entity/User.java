package com.zut.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 梁贵莹
 * @create 2021/6/25 上午 9:30
 * 用户表
 */
@Data

@NoArgsConstructor
@Entity
@Table(name = "tab_user")
public class User implements Serializable{
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private Integer uid;
    /**
     * 用户名
     */
    @Column(name = "uname")
    private String uname;
    /**
     * 积分
     */
    @Column(name = "score")
    private Integer score;
    /**
     * 介绍
     */
    @Column(name = "intro")
    private String intro;
    /**
     * 头像
     */
    @Column(name = "photo")
    private String photo;
    /**
     * 性别
     */
    @Column(name = "uesx")
    private String usex;
    /**
     * 生日
     */
    @Column(name = "birthday")
    private Date birthday;
    /**
     * 居住地
     */
    @Column(name = "address")
    private String address;
    /**
     *  个人认证状态  的id
     */
    @Column(name = "user_authentication")
    private Integer userAuthentication;
    /**
     * 企业认证状态   的id
     */
    @Column(name = "enterprise_authentication")
    private Integer enterpriseAuthentication;
    /**
     * 电话 也是账号
     */
    @Column(name = "phone")
    private String phone;
    /**
     * 密码
     */
    @Column(name = "password")
    private String password;
    /**
     * 最后一次登录时间
     */
    @Column(name = "last_login")
    private Date lastLogin;
    /**
     * 安全等级
     */
    @Column(name = "save_level")
    private Integer saveLevel;

    public User(Integer uid, String uname, Integer score, String intro, String photo, String usex, Date birthday, String address, Integer userAuthentication, Integer enterpriseAuthentication, String phone, String password, Date lastLogin, Integer saveLevel) {
        this.uid = uid;
        if(uname==null){
            this.uname="康康";
        }else{
            this.uname = uname;
        }

        if(score==null){
            this.score=60;
        }else{
            this.score = score;
        }

        if(intro==null){
            this.intro="这是一个默认的介绍";
        }else{
            this.intro = intro;
        }

        if(photo==null){
            this.photo="1.jpg";
        }else{
            this.photo = photo;
        }

        if(usex==null){
            this.usex="男";
        }else{
            this.usex = usex;
        }

        if(birthday==null){
            this.birthday=new Date();
        }else{
            this.birthday = birthday;
        }

        if(address==null){
            this.address="河南省郑州市";
        }else{
            this.address = address;
        }

        if(userAuthentication==null){
            this.userAuthentication=0;
        }else{
            this.userAuthentication = userAuthentication;
        }

        if(enterpriseAuthentication==null){
            this.enterpriseAuthentication=0;
        }else{
            this.enterpriseAuthentication = enterpriseAuthentication;
        }

        if(phone==null){
            this.phone="0000000";
        }else{
            this.phone = phone;
        }

        if(password==null){
            this.password="123";
        }else{
            this.password = password;
        }

        if(lastLogin==null){
            this.lastLogin=new Date();
        }else{
            this.lastLogin = lastLogin;
        }

        if(saveLevel==null){
            this.saveLevel=0;
        }else{
            this.saveLevel = saveLevel;
        }

    }
}
