package com.gul.spring.dao;

import com.gul.spring.model.User;

public interface UserDetailsDao {
  User findUserByUsername(String username);
}
