package org.paradifference.makeadifference.repository;


import org.paradifference.makeadifference.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
