package com.zut.boot.service;

import com.zut.boot.entity.LeaveWords;
import com.zut.boot.entity.Project;
import com.zut.boot.entity.User;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 上午 11:30
 */
public interface ProjectService {
    /**
     * 添加一个项目
     */
    void addOne(Project project);
    /**
     * 修改项目
     */
    void update(Project project);
    /**
     * 删除项目
     */
    void deleteOne(Integer pid);
    /**
     * 根据id获取一个
     */
    Project getOneByPid(Integer pid);
    /**
     * 获取所有
     */
    List<Project> getAll();
    /**
     * 根据类型分页查询
     */
    List<Project> findByType(String type,Integer page,Integer size);
    /**
     *根据状态分页
     */
    List<Project> findByStatus(Integer status,Integer page,Integer size);
    /**
     * 根据发布时间分页
     */
    Page<Project> findByCreateTime(Integer page, Integer size);
    /**
     * 根据金额分页
     */
    Page<Project> findByToMoney(Integer page,Integer size);
    /**
     * 根据积分量分页
     */
    Page<Project> findByScore(Integer page,Integer size);
    /**
     * 根据项目id获取详情
     */
    String findDetailByPid(Integer pid);
//    /**
//     * 根据项目获取所有留言
//     */
//    List<LeaveWords> findWordsByPid(Integer pid);
//    /**
//     * 根据项目获取所有支持者
//     */
//    List<User> findAllSupporterByPid(Integer pid);



}
