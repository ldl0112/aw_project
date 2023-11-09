package com.woniu.aw.springboot.enums;

import lombok.Getter;

/**

 * @author
 */
@Getter
public enum CodeEnum {
    /**
     * 操作成功
     */
    SUCESS(200, "操作成功"),

    /**
     * 系统内部错误
     */
    FAILUIRE(500, "系统内部错误");


    private  Integer code;
    private  String message;

    CodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
