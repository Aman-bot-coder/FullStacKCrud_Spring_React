package com.codewithaman.fullcrud.repository;

import com.codewithaman.fullcrud.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
