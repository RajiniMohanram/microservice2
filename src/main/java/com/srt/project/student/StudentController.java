package com.srt.project.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/stud-details")
	public String getStudentDetails() {
		return "Returning Student's Details";
	}
}
