package com.woniu.aw.springboot.jgdt.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.woniu.aw.springboot.common.ResponseResult;
import com.woniu.aw.springboot.enums.CodeEnum;
import com.woniu.aw.springboot.jgdt.convertor.UserConvertor;
import com.woniu.aw.springboot.jgdt.dto.UserDTO;
import com.woniu.aw.springboot.jgdt.vo.UserVO;
import com.woniu.aw.springboot.jgdt.entity.User;
import com.woniu.aw.springboot.jgdt.mapper.UserMapper;
import com.woniu.aw.springboot.jgdt.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ldl
 * @since 2023-11-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

  /**
    * 保存
    *
    * @param dto 参数
    * @return 保存结果
    */
    @Override
    public Boolean saveOne(UserDTO dto) {
        return this.save(UserConvertor.INSTANCE.toEntity(dto));
    }

    /**
     * 根据主键查询VO
     *
     * @param pk 主键
     * @return VO
     */
     @Override
     public UserVO getByPk(String pk) {
         User domain = this.getById(pk);
         return UserConvertor.INSTANCE.toVO(domain);
     }

     /**
     * 根据主键删除
     *
     * @param pk 主键
     * @return 删除结果
     */
     @Override
     public Boolean deleteByPk(String pk) {
         return this.removeById(pk);
     }

    /**
    * 支持分页的dto条件查询
    *
    * @param page  分页组件
    * @param param 查询参数
    * @return IPage
    */
    @Override
    public IPage<UserVO> selectPageByDto(IPage<User> page, UserDTO param) {
        // todo 根据实际情况组装查询where条件
        QueryWrapper<User> queryWrapper = Wrappers.query();
        IPage<User> iPage = this.getBaseMapper().selectPage(page, queryWrapper);
        return iPage.convert(UserConvertor.INSTANCE::toVO);
    }
}
