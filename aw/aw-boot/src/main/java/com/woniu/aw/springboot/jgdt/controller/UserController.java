package com.woniu.aw.springboot.jgdt.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.woniu.aw.springboot.common.PageRequest;
import com.woniu.aw.springboot.common.ResponseResult;
import com.woniu.aw.springboot.enums.CodeEnum;
import com.woniu.aw.springboot.jgdt.dto.UserDTO;
import com.woniu.aw.springboot.jgdt.entity.User;
import com.woniu.aw.springboot.jgdt.service.IUserService;
import com.woniu.aw.springboot.jgdt.vo.UserVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotEmpty;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ldl
 * @since 2023-11-08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * service
     */
    @Resource
    private IUserService service;

    /**
     * 保存
     *
     * @param dto 参数
     * @return 保存结果
     */
    @PostMapping("/saveUserOne")
    public ResponseResult<Boolean> saveOne(@RequestBody @Validated UserDTO dto) {
        try {
            return ResponseResult.success(CodeEnum.SUCESS.getCode(),CodeEnum.SUCESS.getMessage(),this.service.saveOne(dto));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseResult.fail(CodeEnum.FAILUIRE.getCode(),CodeEnum.FAILUIRE.getMessage());
    }

    /**
     * 根据主键查询VO
     *
     * @param id 主键
     * @return VO
     */
    @GetMapping("/getUserById")
    public ResponseResult<UserVO> getUserById(@Validated @NotEmpty String id) {
        return ResponseResult.success(CodeEnum.SUCESS.getCode(),CodeEnum.SUCESS.getMessage(),this.service.getByPk(id));
    }

    /**
     * 根据主键删除
     *
     * @param pk 主键
     * @return 删除结果
     */
    @DeleteMapping("/{pk}")
    public ResponseResult<Object> deleteByPk(@Validated @NotEmpty @PathVariable("pk") String pk) {
        try {
            return ResponseResult.success(CodeEnum.SUCESS.getCode(),CodeEnum.SUCESS.getMessage(),this.service.deleteByPk(pk));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseResult.fail(CodeEnum.FAILUIRE.getCode(),CodeEnum.FAILUIRE.getMessage());
    }


    /**
     * 分页查询
     *
     * @return BizResult
     */
    @GetMapping("/page")
    public ResponseResult<IPage<UserVO>> page(UserDTO param, PageRequest request) {
        IPage<User> page = new Page<>(request.getPageNum(), request.getPageSize());
        try {
            IPage<UserVO> list = this.service.selectPageByDto(page, param);
            return ResponseResult.success(CodeEnum.SUCESS.getCode(),CodeEnum.SUCESS.getMessage(),list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseResult.fail(CodeEnum.FAILUIRE.getCode(),CodeEnum.FAILUIRE.getMessage());
    }
}
