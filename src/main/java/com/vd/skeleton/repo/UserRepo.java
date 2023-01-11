package com.vd.skeleton.repo;


import com.vd.skeleton.modelo.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>
{
}