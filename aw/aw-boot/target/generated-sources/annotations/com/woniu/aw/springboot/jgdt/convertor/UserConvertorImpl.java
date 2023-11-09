package com.woniu.aw.springboot.jgdt.convertor;

import com.woniu.aw.springboot.jgdt.dto.UserDTO;
import com.woniu.aw.springboot.jgdt.entity.User;
import com.woniu.aw.springboot.jgdt.vo.UserVO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-09T14:43:56+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
public class UserConvertorImpl implements UserConvertor {

    @Override
    public UserVO toVO(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setId( entity.getId() );
        userVO.setUserName( entity.getUserName() );
        userVO.setRoleId( entity.getRoleId() );
        userVO.setUserAge( entity.getUserAge() );
        userVO.setUserEmail( entity.getUserEmail() );
        userVO.setCreateTime( entity.getCreateTime() );
        userVO.setUpdateTime( entity.getUpdateTime() );

        return userVO;
    }

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setUserName( dto.getUserName() );
        user.setRoleId( dto.getRoleId() );
        user.setUserAge( dto.getUserAge() );
        user.setUserEmail( dto.getUserEmail() );
        user.setCreateTime( dto.getCreateTime() );
        user.setUpdateTime( dto.getUpdateTime() );

        return user;
    }
}
