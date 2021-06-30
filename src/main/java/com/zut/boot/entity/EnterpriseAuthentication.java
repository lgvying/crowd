package com.zut.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 梁贵莹
 * @create 2021/6/25 上午 10:54
 * 企业认证表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tab_enterprise_authentication")
public class EnterpriseAuthentication implements Serializable {
    /**
     * 认证id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enterprise_authentication_id")
    private Integer enterpriseAuthenticationId;
    /**
     * 企业名称
     */
    @Column(name = "enterprise_name")
    private String enterpriseName;
    /**
     * 社会信用代码 18位
     */
    @Column(name = "social_creditCode")
    private String socialCreditCode;
    /**
     * 企业法定代理人
     */
    @Column(name = "user_name")
    private String userName;
    /**
     * 企业法定代理人身份证号码
     */
    @Column(name = "ID_number")
    private String IDNumber;
    /**
     * 企业法定代理人身份证
     */
    @Column(name = "ID_phone")
    private String IDPhoto;
    /**
     * 企业营业执照
     */
    @Column(name = "license_photo")
    private String licensePhoto;
    /**
     * 企业地址
     */
    @Column(name = "enterprise_address")
    private String enterpriseAddress;

}
