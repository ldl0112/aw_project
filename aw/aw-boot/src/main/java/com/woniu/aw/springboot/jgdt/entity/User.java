package com.woniu.aw.springboot.jgdt.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName(value = "user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户-角色-维度表主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("user_name")
    private Long userName;

    @TableField("role_id")
    private Long roleId;

    @TableField("user_age")
    private Long userAge;

    @TableField("user_email")
    private String userEmail;


    //@DateTimeFormat(pattern="yyyy-MM-dd")
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
