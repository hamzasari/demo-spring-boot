package com.hamzasari.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController() {
  @GetMapping("/hello")
  fun hello(): String {
    return "Hello World!"
  }
}