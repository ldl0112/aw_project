package com.woniu.aw.springboot.jgdt.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * VO
 * </p>
 *
 * @author ldl
 * @since 2023-11-08
 */
@Data
@ApiModel(value = "User对象", description = "")
public class UserVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户-角色-维度表主键id")
    private Integer id;

    @ApiModelProperty("")
    private Long userName;

    @ApiModelProperty("")
    private Long roleId;

    @ApiModelProperty("")
    private Long userAge;

    @ApiModelProperty("")
    private String userEmail;

    @ApiModelProperty("")
    private LocalDateTime createTime;

    @ApiModelProperty("")
    private LocalDateTime updateTime;
}
