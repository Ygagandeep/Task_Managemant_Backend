package com.taskManagement.repository;

import com.taskManagement.entities.User;
import com.taskManagement.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String username);

    Optional<User> findByUserRole(UserRole userRole);

    // this is added
    List<User> findAll();

    Optional<User> findById(Long id);

    void deleteById(Long id);





}
