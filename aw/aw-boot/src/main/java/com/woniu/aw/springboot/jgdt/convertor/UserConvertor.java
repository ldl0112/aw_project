package com.woniu.aw.springboot.jgdt.convertor;


import com.woniu.aw.springboot.convertor.AbstractConvertor;
import com.woniu.aw.springboot.jgdt.dto.UserDTO;
import com.woniu.aw.springboot.jgdt.entity.User;
import com.woniu.aw.springboot.jgdt.vo.UserVO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(builder = @Builder(disableBuilder = true))
public interface UserConvertor extends AbstractConvertor<UserVO, UserDTO, User> {
    UserConvertor INSTANCE = Mappers.getMapper(UserConvertor.class);
}