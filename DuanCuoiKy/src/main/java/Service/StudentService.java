package Service;

import java.util.List;

import Model.Studentmodel;

public interface StudentService {
    List<Studentmodel> getAllStudents();
    Studentmodel getStudentById(Long id);
    Studentmodel saveStudent(Studentmodel student);
    Studentmodel updateStudent(Long id, Studentmodel updatedStudent);
    void deleteStudent(Long id);
}
