package com.curdoperation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curdoperation.entity.StudentEntity;
import com.curdoperation.service.StudentService;

@RestController
@RequestMapping("/curd")
public class StudentController {

	@Autowired
	private StudentService stu;

	@PostMapping("/post")
	public StudentEntity sten(@RequestBody StudentEntity st) {
		return stu.postData(st);
	}

	@GetMapping("/get/{id}")
	public Optional<StudentEntity> stene(@PathVariable("id") Integer i) {
		return stu.getData(i);
	}

	@PutMapping("/put/{id}")
	public StudentEntity st(@PathVariable("id") Integer i, @RequestBody StudentEntity st) {
		return stu.postdata(i, st);
	}
	
	@DeleteMapping("/delete/{id}")
	public String sten(@PathVariable("id") Integer i,@RequestBody StudentEntity sr)
	{
		return stu.deleteData(i,sr);
	}
}