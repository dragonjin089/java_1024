package db.day4.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import db.day4.vo.CourseVO;
import db.day4.vo.StudentVO;

public interface StudentDAO {
	ArrayList<StudentVO> selectAllStudent(); // 구현부가 mapper

	void insertStudent(@Param("std")StudentVO std);
	// 매개변수가 2개이상일때 param

	void insertCourse(CourseVO co);
}
