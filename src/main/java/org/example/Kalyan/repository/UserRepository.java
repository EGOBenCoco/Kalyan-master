package org.example.Kalyan.repository;

import org.example.Kalyan.models.Client;
import org.example.Kalyan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>
{
    User findByEmail(String email);
    User findByIdUser(Integer id);
}
