package com.hackerrank.sample.repository;

import com.hackerrank.sample.model.Employees;
import com.hackerrank.sample.model.Model;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("modelRepository")
public interface ModelRepository extends JpaRepository<Model, Long> {
    @Transactional
    Long deleteById(Long id);
   
	Employees save(Iterable<S> newEmployee);
}
