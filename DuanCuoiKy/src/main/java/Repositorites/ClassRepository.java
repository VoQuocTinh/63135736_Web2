package Repositorites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Classsmodel;

@Repository
public interface ClassRepository extends JpaRepository<Classsmodel, Long> {
}

