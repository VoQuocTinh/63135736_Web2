package Repositorites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Studentmodel;

@Repository
public interface StudentRepository extends JpaRepository<Studentmodel, Long> {
}

