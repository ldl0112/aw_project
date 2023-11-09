package com.woniu.aw.springboot.convertor;


public interface AbstractConvertor<VO, DTO, ENTITY> {

    VO toVO(ENTITY entity);

    ENTITY toEntity(DTO dto);

}
