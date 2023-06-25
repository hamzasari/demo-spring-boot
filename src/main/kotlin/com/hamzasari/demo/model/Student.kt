package com.hamzasari.demo.model

import jakarta.persistence.*


@Entity
@Table(name = "student")
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    var id: Long? = null

    var name: String? = null
    var email: String? = null
}