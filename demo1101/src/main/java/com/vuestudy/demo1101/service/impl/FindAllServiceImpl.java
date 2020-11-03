package com.vuestudy.demo1101.service.impl;

import com.vuestudy.demo1101.dao.FindAllMapper;
import com.vuestudy.demo1101.entity.User;
import com.vuestudy.demo1101.service.FindAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("findallservice")
public class FindAllServiceImpl implements FindAllService {

    @Autowired
    FindAllMapper findAllMapper;

    @Override
    public List<User> findall() {

        return findAllMapper.findall();
    }
}
