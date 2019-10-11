package com.bw.mapper;

import java.util.List;

import com.bw.entity.Industry;

public interface IndustryDao {
	public List<Industry> queryAll(Integer sid);
}
