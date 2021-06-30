package com.zut.boot.controller;

import com.zut.boot.entity.Zan;
import com.zut.boot.service.ZanService;
import com.zut.boot.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 梁贵莹
 * @create 2021/6/29 下午 12:04
 */
@RestController
@RequestMapping("/zan")
public class ZanController {
    @Autowired
    private ZanService zanService;

    /**
     * 点赞
     * @param zan
     * @return
     */
    @RequestMapping(value = "/addOne",method = RequestMethod.POST)
    public ResponseVo<String> addOne(Zan zan){
        return zanService.addOne(zan);
    }

    /**
     * 取消点赞
     * @param zid
     * @return
     */
    @DeleteMapping
    public ResponseVo<String> deleteOne(Integer zid){
        return zanService.deleteOne(zid);
    }

    /**
     * 根据用户id和项目id查看点赞情况
     * @param pid
     * @param uid
     * @return
     */
    @RequestMapping(value = "/getOneByUidPid/{pid}/{uid}",method = RequestMethod.GET)
    public ResponseVo<Zan> getOneByUidPid(@PathVariable("pid") Integer pid,
                                          @PathVariable("uid") Integer uid){
        return zanService.getOneByPidUid(pid,uid);
    }
}
