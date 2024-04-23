package Service;

import java.util.List;
import java.util.Optional;

import Model.Studentmodel;

public interface StudentService {
    
    List<Studentmodel> getAllStudents();
    
    Optional<Studentmodel> getStudentById(Integer studentId);
    
    Studentmodel saveStudent(Studentmodel student);
    
    Studentmodel updateStudent(Integer studentId, Studentmodel updatedStudent);
    
    void deleteStudent(Integer studentId);
    
}


