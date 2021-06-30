package com.zut.boot.service;

import com.zut.boot.entity.LeaveWords;
import com.zut.boot.vo.ResponseVo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/28 下午 5:09
 */
public interface LeaveWordsService {
    /**
     * 根据项目获取所有留言
     */
    List<String> findWordsByPid(Integer pid, Integer page, Integer size);

    /**
     * 增
     * @param leaveWords
     */
    void addOne(LeaveWords leaveWords);

    /**
     * 删除
     * @param lid
     */
    void deleteOne(Integer lid);

    /**
     * 修改
     * @param leaveWords
     */
    void updateOne(LeaveWords leaveWords);

    /**
     * 根据pid获取留言量
     * @param pid
     * @return
     */
    ResponseVo<Integer> getCountByPid(Integer pid);

}
