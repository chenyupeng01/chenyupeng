package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Industry;
import com.bw.mapper.IndustryDao;
@Service
public class IndustryServiceImp implements IndustryService{
	@Resource
	private IndustryDao dao;
	public List<Industry> queryAll(Integer sid) {
		// TODO Auto-generated method stub
		return dao.queryAll(sid);
	}

}
