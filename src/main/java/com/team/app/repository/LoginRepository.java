package com.team.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.team.app.model.Login;

@Component
public interface LoginRepository extends JpaRepository<Login,Integer>{

	Optional<Login> findByUserName(String user);
}
