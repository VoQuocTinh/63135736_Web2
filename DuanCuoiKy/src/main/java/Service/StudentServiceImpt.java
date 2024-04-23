package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Studentmodel;
import Repositorites.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpt implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Studentmodel> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Studentmodel> getStudentById(Integer studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public Studentmodel saveStudent(Studentmodel student) {
        return studentRepository.save(student);
    }

    @Override
    public Studentmodel updateStudent(Integer studentId, Studentmodel updatedStudent) {
        // Check if student with given ID exists
        if (studentRepository.existsById(studentId)) {
            updatedStudent.setStudentId(studentId);
            return studentRepository.save(updatedStudent);
        } else {
            // Handle the case when student with given ID does not exist
            return null;
        }
    }

    @Override
    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}




