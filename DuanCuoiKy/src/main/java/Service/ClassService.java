package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Classsmodel;
import Repositorites.ClassRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<Classsmodel> getAllClasses() {
        return classRepository.findAll();
    }

    public Optional<Classsmodel> getClassById(Long id) {
        return classRepository.findById(id);
    }

    public Classsmodel saveClass(Classsmodel classs) {
        return classRepository.save(classs);
    }

    public Classsmodel updateClass(Long id, Classsmodel updatedClass) {
        if (classRepository.existsById(id)) {
            updatedClass.setId(id);
            return classRepository.save(updatedClass);
        } else {
            throw new RuntimeException("Class not found with id: " + id);
        }
    }

    public void deleteClass(Long id) {
        if (classRepository.existsById(id)) {
            classRepository.deleteById(id);
        } else {
            throw new RuntimeException("Class not found with id: " + id);
        }
    }
}

