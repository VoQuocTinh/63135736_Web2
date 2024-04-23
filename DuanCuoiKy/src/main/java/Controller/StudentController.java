package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import Model.Studentmodel;
import Service.StudentService;

import java.util.List;

//AdminController.java
@Controller
@RequestMapping("/admin")
public class StudentController {
 @Autowired
 private StudentService studentService;
 
 @GetMapping("/students")
 public String getAllStudents(Model model) {
     List<Studentmodel> students = studentService.getAllStudents();
     model.addAttribute("students", students);
     return "admin/students";
 }

 // Other CRUD endpoints
 @PostMapping("/students")
 public String createStudent(@ModelAttribute("student") Studentmodel student) {
     studentService.saveStudent(student);
     return "redirect:/admin/students"; // Chuyển hướng về trang danh sách sinh viên sau khi tạo thành công
 }

 @GetMapping("/students/{id}/edit")
 public String showUpdateForm(@PathVariable("id") Long id, Model model) {
     Studentmodel student = studentService.getStudentById(id);
     model.addAttribute("student", student);
     return "admin/edit-student"; // Trả về trang chỉnh sửa sinh viên với thông tin của sinh viên đã được điền sẵn
 }

 @PostMapping("/students/{id}/update")
 public String updateStudent(@PathVariable("id") Long id, @ModelAttribute("student") Studentmodel updatedStudent) {
     studentService.updateStudent(id, updatedStudent);
     return "redirect:/admin/students"; // Chuyển hướng về trang danh sách sinh viên sau khi cập nhật thành công
 }

 @GetMapping("/students/{id}/delete")
 public String deleteStudent(@PathVariable("id") Long id) {
     studentService.deleteStudent(id);
     return "redirect:/admin/students"; // Chuyển hướng về trang danh sách sinh viên sau khi xóa thành công
 }

}


