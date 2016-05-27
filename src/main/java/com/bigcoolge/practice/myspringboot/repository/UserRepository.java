package com.bigcoolge.practice.myspringboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bigcoolge.practice.myspringboot.entity.UserPojo;

@Transactional
public interface UserRepository extends JpaRepository<UserPojo, Long>{

}
