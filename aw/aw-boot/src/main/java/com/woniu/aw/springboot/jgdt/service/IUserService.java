package com.woniu.aw.springboot.jgdt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.woniu.aw.springboot.common.ResponseResult;
import com.woniu.aw.springboot.jgdt.dto.UserDTO;
import com.woniu.aw.springboot.jgdt.vo.UserVO;
import com.woniu.aw.springboot.jgdt.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ldl
 * @since 2023-11-08
 */
public interface IUserService extends IService<User> {

    /**
     * 保存
     *
     * @param dto 参数
     * @return 保存结果
     */
    Boolean  saveOne(UserDTO dto);

    /**
     * 根据主键查询VO
     *
     * @param pk 主键
     * @return VO
     */
    UserVO getByPk(String pk);


    /**
     * 根据主键删除
     *
     * @param pk 主键
     * @return 删除结果
     */
   Boolean deleteByPk(String pk);

    /**
     * 支持分页的dto条件查询
     *
     * @param page  分页组件
     * @param param 查询参数
     * @return IPage
     */
    IPage<UserVO> selectPageByDto(IPage<User> page, UserDTO param);
}
