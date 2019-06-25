package com.beetoffice.biz.commute.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.commute.CommuteService;
import com.spring.biz.commute.CommuteVO;

@Service("Commute")
public class CommuteServiceImpl implements CommuteService {

    @Autowired
    private CommuteDAO CommuteDAO;

    @Override
    public void insertCommute(CommuteVO vo) {
        CommuteDAO.insertCommute(vo);
    }

    @Override
    public void updateCommute(CommuteVO vo) {
    	CommuteDAO.updateCommute(vo);

    }

    @Override
    public List<CommuteVO> getCommuteList(CommuteVO vo) {
    	return CommuteDAO.CommuteList(vo);
    }
	
}
