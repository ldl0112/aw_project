package com.woniu.aw.springboot.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class BaseEntity implements java.io.Serializable {

    private static final long serialVersionUID = -1340012861108303402L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
}
