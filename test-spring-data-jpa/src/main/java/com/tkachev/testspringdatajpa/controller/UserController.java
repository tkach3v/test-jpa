package com.tkachev.testspringdatajpa.controller;

import com.tkachev.testspringdatajpa.entity.User;
import com.tkachev.testspringdatajpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> getCount() {
        return new ResponseEntity<>(userService.getCount(), HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<User> getUserByNameAndAge(@RequestParam(name = "name") String name,
                                                    @RequestParam(name = "age",  required = false) Integer age) {

        if (age == null) {
            return new ResponseEntity<>(userService.getUserByName(name), HttpStatus.OK);
        }

        return new ResponseEntity<>(userService.getUserByNameAndAge(name, age), HttpStatus.OK);
    }
}
