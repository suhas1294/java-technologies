package com.suhas.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepoository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
