package com.example.simpleuserserv3.service;

import com.example.simpleuserserv3.resource.User;
import com.example.simpleuserserv3.resource.UserCollection;

import java.util.Optional;

public interface UserService {

    User createUser(User user);
    User getUser(Long id);
    UserCollection findUsers(Optional<String> firstName, int pageSize, int page);
}
