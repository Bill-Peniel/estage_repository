package com.mef.estage.services;

import com.hanzoy.utils.Token;
import com.mef.estage.entities.administration.User;
import com.mef.estage.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }

    public Optional<User> findById(Long id) {

        Optional<User> usr = userRepository.findById(id);

        return usr;
    }

    public void deleteById(Long id) {

       userRepository.unlink(id);

    }

}