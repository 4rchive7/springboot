package com.toyproject.springboot.service;

import com.toyproject.springboot.mapper.TestMapper;
import com.toyproject.springboot.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    public TestMapper mapper;

    public List<TestVo> bringData(){
        return mapper.bringData();
    }

}
