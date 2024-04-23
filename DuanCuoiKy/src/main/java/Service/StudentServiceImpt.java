package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Studentmodel;
import Repositorites.StudentRepository;

@Service
public class StudentServiceImpt implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Studentmodel> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Studentmodel getStudentById(int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Studentmodel saveStudent(Studentmodel student) {
        return studentRepository.save(student);
    }

    @Override
    public Studentmodel updateStudent(int studentId, Studentmodel updatedStudent) {
        Studentmodel existingStudent = studentRepository.findById(studentId).orElse(null);
        if (existingStudent != null) {
            existingStudent.setStudentName(updatedStudent.getStudentName());
            existingStudent.setDateOfBirth(updatedStudent.getDateOfBirth());
            existingStudent.setGender(updatedStudent.getGender());
            existingStudent.setAddress(updatedStudent.getAddress());
            existingStudent.setPhone(updatedStudent.getPhone());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setNationality(updatedStudent.getNationality());
            existingStudent.setSequenceNumber(updatedStudent.getSequenceNumber());
            existingStudent.setClassId(updatedStudent.getClassId());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    @Override
    public void deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
    }
}



