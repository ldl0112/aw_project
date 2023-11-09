package com.xx;

import lombok.Data;

@Data
public class BizResult<T> {
    private String code;
    private String message;
    private T data;

    /**
     * 封装返回值对象
     *
     * @param t   真实对象
     * @param <T> 对象类型
     * @return 包装对象
     */
    public static <T> BizResult<T> success(T t) {
        BizResult<T> res = new BizResult<>();
        res.setCode("0000");
        res.setData(t);
        return res;
    }
}
