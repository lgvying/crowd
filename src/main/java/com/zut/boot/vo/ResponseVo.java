package com.zut.boot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 梁贵莹
 * @create 2021/6/28 上午 10:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseVo<T>{
    private String message;
    private Integer status;
    private T data;

}
