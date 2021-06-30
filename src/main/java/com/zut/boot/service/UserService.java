package com.zut.boot.service;

import com.zut.boot.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/25 上午 11:17
 */
public interface UserService {
    /**
     * 添加一个用户
     * @return
     */
    void addOne(User user);

    /**
     * 删除一个
     * @return
     */
    void deleteOne(int uid);

    /**
     * 修改
     * @return
     */
    void update(User user);

    /**
     * 根据id查询一个
     * @param uid
     * @return
     */
    User getOne(int uid);

    /**
     * 查询所有
     * @return
     */
    List<User> getAll();
    /**
     * 根据账号查询密码
     * @param phone
     * @return
     */

    /**
     * 根据账号获取对象
     * @param phone
     * @return
     */
    User getOneByPhone(String phone);

    /**
     * 分页查询
     * @param userIds
     * @param pageable
     * @return
     */
    Page<User> findAllByUserIdIn(List<Long> userIds, Pageable pageable);

}
