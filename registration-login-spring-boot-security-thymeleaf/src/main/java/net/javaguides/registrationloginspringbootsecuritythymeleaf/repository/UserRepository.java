package net.javaguides.registrationloginspringbootsecuritythymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.registrationloginspringbootsecuritythymeleaf.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    User findByEmail(String email);

}
