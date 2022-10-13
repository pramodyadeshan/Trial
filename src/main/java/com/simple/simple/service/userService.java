package com.simple.simple.service;

import com.simple.simple.dto.StudentDTO;
import com.simple.simple.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class userService {
    @Autowired
    private StudentRepo studentRepo;
}
