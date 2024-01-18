package com.curdoperation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdoperation.entity.StudentEntity;
import com.curdoperation.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository stre;

	public StudentEntity postData(StudentEntity st) {

		return stre.save(st);
	}

	public Optional<StudentEntity> getData(Integer i) {

		return stre.findById(i);
	}

	public StudentEntity postdata(Integer i, StudentEntity st) {
		Optional<StudentEntity> stuu = stre.findById(i);
		StudentEntity s = stuu.get();
		s.setName(st.getName());
		s.setEmail(st.getEmail());
		s.setPhone(st.getPhone());
		return stre.save(s);
	}

	public String deleteData(Integer i, StudentEntity sr) {
		stre.deleteById(i);
		return "Deleted SuccessFully";
	}

}
