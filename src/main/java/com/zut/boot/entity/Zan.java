package com.zut.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 梁贵莹
 * @create 2021/6/28 下午 12:07
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tab_zan")
public class Zan implements Serializable {
    /**
     * 点赞id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zid")
    Integer zid;
    /**
     * 用户id
     */
    @Column(name = "uid")
    Integer uid;
    /**
     * 项目id
     */
    @Column(name = "pid")
    Integer pid;
    /**
     * 赞的状态
     */
    @Column(name = "zan_status")
    Integer zanStatus;

}
