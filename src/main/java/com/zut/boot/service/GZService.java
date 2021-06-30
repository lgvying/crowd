package com.zut.boot.service;

import com.zut.boot.entity.Guanzhu;
import com.zut.boot.vo.ResponseVo;

/**
 * @author 梁贵莹
 * @create 2021/6/29 下午 2:17
 */
public interface GZService {
    /**
     * 关注
     * @param guanzhu
     */
    ResponseVo<String> addOne(Guanzhu guanzhu);

    /**
     * 取消关注
     * @param gid
     */
    ResponseVo<String> deleteOne(Integer gid);

    /**
     * 根据项目id和用户id查看是否关注
     * @param pid
     * @return
     */
    ResponseVo<Guanzhu> getOneByPidUid(Integer pid,Integer uid);
}
