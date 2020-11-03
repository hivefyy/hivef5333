package com.vuestudy.demo1101.service.impl;

import com.vuestudy.demo1101.dao.DeleteMapper;
import com.vuestudy.demo1101.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("deleteService")
public class DeleteServiceImpl implements DeleteService {
    @Autowired
    DeleteMapper deleteMapper;

    @Override
    public Boolean delsteuser(Integer id) {

        return deleteMapper.deleteruser(id);
    }
}
