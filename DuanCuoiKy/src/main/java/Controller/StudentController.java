package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Model.Studentmodel;
import Service.StudentService;

import java.util.List;

@RestController
public class StudentController {

	@Autowired StudentService studentService;
	@GetMapping("/dsHocSinh")
	public List<Studentmodel> getAllStudents()
	{
		return studentService.getAllStudents();
	}

}
