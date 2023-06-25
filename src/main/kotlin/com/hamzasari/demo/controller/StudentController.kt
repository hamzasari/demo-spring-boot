package com.hamzasari.demo.controller

import com.hamzasari.demo.model.Student
import com.hamzasari.demo.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {
    @Autowired
    private lateinit var studentRepo: StudentRepository

    @GetMapping("/students")
    fun listAll(): List<Student> {
        return studentRepo.findAll()
    }
}