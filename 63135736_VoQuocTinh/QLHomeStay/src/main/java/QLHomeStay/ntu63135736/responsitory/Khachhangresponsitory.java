package QLHomeStay.ntu63135736.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import QLHomeStay.ntu63135736.model.Khachhangmodel;

@Repository
public interface Khachhangresponsitory extends JpaRepository<Khachhangmodel, Integer> {
}
