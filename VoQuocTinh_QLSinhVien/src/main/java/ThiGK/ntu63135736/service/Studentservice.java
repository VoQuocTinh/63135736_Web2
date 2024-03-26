package ThiGK.ntu63135736.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ThiGK.ntu63135736.models.Student;
@Service
public class Studentservice {
    private List<Student> students;

    public Studentservice() {
        // Khởi tạo danh sách Sinh viên và hard-code dữ liệu
        students = new ArrayList<>();
        students.add(new Student("SV001", "Nguyen Van A", 8.5));
        students.add(new Student("SV002", "Tran Thi B", 7.2));
        students.add(new Student("SV003", "Hoang Minh C", 9.0));
    }

    // Phương thức để trả về danh sách Sinh viên
    public List<Student> getAllStudents() {
        return students;
    }

    // Phương thức để tìm kiếm Sinh viên thông qua mã
    public Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null; // Trả về null nếu không tìm thấy Sinh viên có mã tương ứng
    }

    // Phương thức để thêm mới một Sinh viên vào danh sách
    public void addStudent(Student student) {
        students.add(student);
    }
    
}
