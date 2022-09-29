package com.example.DEV.repositories;

import com.example.DEV.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {

}
