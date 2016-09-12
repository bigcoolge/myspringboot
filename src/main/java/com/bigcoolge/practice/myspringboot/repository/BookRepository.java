package com.bigcoolge.practice.myspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bigcoolge.practice.myspringboot.entity.BookPojo;

public interface BookRepository  extends JpaRepository<BookPojo, String>{

}
