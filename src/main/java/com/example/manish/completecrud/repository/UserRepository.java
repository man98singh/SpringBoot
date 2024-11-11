package com.example.manish.completecrud.repository;

import com.example.manish.completecrud.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {


}
