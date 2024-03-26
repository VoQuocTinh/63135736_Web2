package ThiGK.ntu63135736.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import ThiGK.ntu63135736.models.Student;
import ThiGK.ntu63135736.service.Studentservice;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private Studentservice studentService;

    // Endpoint để lấy toàn bộ danh sách sinh viên
    @RequestMapping("/")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Endpoint để tìm kiếm sinh viên theo mã sinh viên
    @RequestMapping("/id")
    public Student getStudentById(@PathVariable("id") String id) {
        return studentService.findStudentById(id);
    }

    // Endpoint để thêm mới một sinh viên
    @PostMapping("/")
    public ResponseEntity<Void> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
