package org.example.Kalyan.repository;

import jakarta.persistence.criteria.Order;
import org.example.Kalyan.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}
