package com.kl.jfsdspringbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kl.jfsdspringbootmvc.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {

   
   @Query("select u from User u where u.email = ?1 and u.password = ?2")
   public User findByEmailAndPassword(String email, String password);


}
