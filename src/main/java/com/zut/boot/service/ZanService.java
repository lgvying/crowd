package com.zut.boot.service;

import com.zut.boot.entity.Zan;
import com.zut.boot.vo.ResponseVo;

/**
 * @author 梁贵莹
 * @create 2021/6/29 上午 11:50
 */
public interface ZanService {
    /**
     * 点赞
     * @param zan
     */
    ResponseVo<String> addOne(Zan zan);

    /**
     * 取消赞
     * @param zid
     */
    ResponseVo<String> deleteOne(Integer zid);

    /**
     * 根据项目查找赞
     * @param pid
     * @return
     */
    ResponseVo<Zan> getOneByPidUid(Integer pid,Integer uid);
}
