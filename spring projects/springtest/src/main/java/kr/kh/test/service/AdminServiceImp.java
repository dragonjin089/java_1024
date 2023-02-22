package kr.kh.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import kr.kh.test.dao.AdminDAO;

public class AdminServiceImp implements AdminService {

	@Autowired
	AdminDAO adminDao;
}
