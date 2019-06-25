package com.beetoffice.biz.approval.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.approval.ApprovalService;
import com.spring.biz.approval.ApprovalVO;


//@Service : @Component를 상속받아 만든 
//비즈니스 로직처리 서비스 영역에 사용
@Service("ApprovalService")
public class ApprovalServiceImpl implements ApprovalService {
	@Autowired
	
	private ApprovalDAO approvalDAO;
	
	public ApprovalServiceImpl() {
		System.out.println(">> ApprovalServiceImpl 객체 생성");
	}

	public void insertApproval(ApprovalVO vo) {
		approvalDAO.insertApproval(vo);
	}

	@Override
	public void updateApproval(ApprovalVO vo) {
		approvalDAO.updateApproval(vo);
	}
	@Override
	public void refuseApproval(ApprovalVO vo) {
		approvalDAO.refuseApproval(vo);
	}

	@Override
	public void deleteApproval (ApprovalVO vo) {
		approvalDAO.deleteApproval(vo);
	}

	@Override
	public ApprovalVO getApproval(ApprovalVO vo) {
		return approvalDAO.getApproval(vo);
	}

	@Override
	public List<ApprovalVO> getApprovalList(ApprovalVO vo) {
		return approvalDAO.getApprovalList(vo);
	}

}














