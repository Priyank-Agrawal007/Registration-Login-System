package net.javaguides.registrationloginspringbootsecuritythymeleaf.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.registrationloginspringbootsecuritythymeleaf.model.User;
import net.javaguides.registrationloginspringbootsecuritythymeleaf.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    
    User save(UserRegistrationDto registrationDto);
}
