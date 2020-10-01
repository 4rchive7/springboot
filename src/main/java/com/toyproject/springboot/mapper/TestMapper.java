package com.toyproject.springboot.mapper;

import com.toyproject.springboot.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    List<TestVo> bringData();
}
