package com.teamTS.funfun.repository;

import com.teamTS.funfun.model.TestModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestRepository{
    List<TestModel> getTestData();
}