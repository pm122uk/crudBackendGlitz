package com.fordGlitz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fordGlitz.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}