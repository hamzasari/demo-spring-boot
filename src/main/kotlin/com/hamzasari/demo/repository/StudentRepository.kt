package com.hamzasari.demo.repository

import com.hamzasari.demo.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Long> {
}