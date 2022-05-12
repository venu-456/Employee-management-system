
package com.venu.apps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venu.apps.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp,Integer> {
	
}
