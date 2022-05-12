package com.venu.apps.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venu.apps.entity.User;

public interface UserRepo extends JpaRepository <User,Integer>{

}
