package com.woniu.aw.springboot.jgdt.mapper;

import com.woniu.aw.springboot.jgdt.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
