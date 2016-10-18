package com.bigcoolge.practice.myspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bigcoolge.practice.myspringboot.entity.BookPojo;

public interface BookRepository  extends JpaRepository<BookPojo, String>{
	
	@Query("select b from BookPojo b where b.name = :name and b.publisher = :publisher")
	public List<BookPojo> findByNameAndPublisher(@Param("name")String name, @Param("publisher")String publisher);
	
	public List<BookPojo> findByName(String name);

	public Long countByPublisher(String publisher);
}
