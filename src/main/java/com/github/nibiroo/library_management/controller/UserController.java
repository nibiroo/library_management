package com.github.nibiroo.library_management.controller;

import com.github.nibiroo.library_management.entity.User;
import com.github.nibiroo.library_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id) {

        Optional<User> optionalUser = userRepository.findById(id);

        return optionalUser.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/edit/{id}",  consumes = {"application/json"})
    public ResponseEntity<User> updateUserById(@PathVariable(value = "id") Long idParam, @RequestBody User userRequestBody) {

        Optional<User> optionalUser = userRepository.findById(idParam);

        if (optionalUser.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        User existingUser = optionalUser.get();
        existingUser.setName(userRequestBody.getName());
        existingUser.setEmail(userRequestBody.getEmail());
        existingUser.setPhoneNumber(userRequestBody.getPhoneNumber());

        userRepository.save(existingUser);

        return ResponseEntity.ok(existingUser);
    }

    @PostMapping("/create")
    public User postUser(@RequestBody User userRequestBody){
        return userRepository.save(userRequestBody);
    }
}
