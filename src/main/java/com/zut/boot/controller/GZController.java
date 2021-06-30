package com.zut.boot.controller;

import com.zut.boot.entity.Guanzhu;
import com.zut.boot.service.GZService;
import com.zut.boot.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 梁贵莹
 * @create 2021/6/29 下午 2:27
 */
@RestController
@RequestMapping("/gz")
public class GZController {
    @Autowired
    private GZService gzService;
    @RequestMapping(value = "/addOne",method = RequestMethod.POST)
    public ResponseVo<String> addOne(Guanzhu guanzhu){
        return gzService.addOne(guanzhu);
    }
    @RequestMapping(value = "/getOneByPidUid/{pid}/{uid}",method = RequestMethod.GET)
    public ResponseVo<Guanzhu> getOneByPidUid(@PathVariable("pid") Integer pid,
                                              @PathVariable("uid") Integer uid){
        return gzService.getOneByPidUid(pid,uid);
    }
    @DeleteMapping
    public ResponseVo<String> deleteOne(Integer gid){
        return  gzService.deleteOne(gid);
    }
}
