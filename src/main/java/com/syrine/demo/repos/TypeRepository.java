package com.syrine.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.syrine.demo.entities.Type;

@RepositoryRestResource(path="typ")
public interface TypeRepository extends JpaRepository<Type,Long>{

}
