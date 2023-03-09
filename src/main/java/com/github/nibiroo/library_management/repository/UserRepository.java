package com.github.nibiroo.library_management.repository;

import com.github.nibiroo.library_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { // <Repository Class Type, Id type>

}