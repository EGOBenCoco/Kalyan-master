package org.example.Kalyan.repository;

import org.example.Kalyan.models.Kalyan;
import org.example.Kalyan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KalyanRepository extends JpaRepository<Kalyan,Integer> {
    Kalyan findByIdKalyan(int id);
}
