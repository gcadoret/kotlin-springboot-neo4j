package com.terodacg.springbootkotlin

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun getHello(): String {
        return "hello service"
    }
}