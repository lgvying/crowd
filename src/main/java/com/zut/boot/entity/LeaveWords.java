package com.zut.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 梁贵莹
 * @create 2021/6/28 上午 11:53
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tab_leave_words")
public class LeaveWords implements Serializable {
    /**
     * 留言id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lid")
    Integer lid;
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
     * 留言内容
     */
    @Column(name = "words")
    String words;
}
