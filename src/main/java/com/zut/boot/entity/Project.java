package com.zut.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 梁贵莹
 * @create 2021/6/28 上午 11:09
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tab_project")
public class Project implements Serializable {
    /**
     * 项目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid")
    Integer pid;
    /**
     * 项目名
     */
    @Column(name = "pname")
    String pname;
    /**
     * 项目类型
     */
    @Column(name = "type")
    String type;
    /**
     * 项目短标题
     */
    @Column(name = "title")
    String title;
    /**
     * 项目介绍
     */
    @Column(name = "intro")
    String intro;
    /**
     * 项目标签
     */
    @Column(name = "tag")
    String tag;
    /**
     * 项目发起省
     */
    @Column(name = "a_province")
    String aProvince;
    /**
     * 项目发起市
     */
    @Column(name = "a_city")
    String aCity;
    /**
     * 开始时间
     */
    @Column(name = "begin_time")
    String beginTime;
    /**
     * 结束时间
     */
    @Column(name = "over_time")
    String overTime;
    /**
     * 目标钱数
     */
    @Column(name = "to_money")
    Float toMoney;
    /**
     * 状态
     */
    @Column(name = "status")
    Integer status;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    String createTime=new Date().toString();
    /**
     * 项目详情
     */
    @Column(name = "detail")
    String detail;
    /**
     * 项目积分
     */
    @Column(name = "score")
    Integer score;
    /**
     * 项目点击、量
     */
    @Column(name = "hits")
    Integer hits;

}
