package QLHomeStay.ntu63135736.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import QLHomeStay.ntu63135736.model.Phongmodel;

@Repository
public interface Phongresponsitory extends JpaRepository<Phongmodel, Integer> {
}
