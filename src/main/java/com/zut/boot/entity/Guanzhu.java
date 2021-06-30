package com.zut.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 梁贵莹
 * @create 2021/6/28 上午 11:59
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tab_guanzhu")
public class Guanzhu implements Serializable {
    /**
     * 关注id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gid")
    Integer fid;
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
}
