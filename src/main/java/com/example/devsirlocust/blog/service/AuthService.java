package com.example.devsirlocust.blog.service;

import com.example.devsirlocust.blog.dto.RegisterRequest;
import com.example.devsirlocust.blog.model.User;
import com.example.devsirlocust.blog.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

  @Autowired
  private UserRepository userRepository;

  public void signup(RegisterRequest registerRequest) {
    User user = new User();
    user.setUsername(registerRequest.getUsername());
    user.setPassword(registerRequest.getPassword());
    userRepository.save(user);
  }

}
