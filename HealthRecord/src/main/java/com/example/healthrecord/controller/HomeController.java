//package com.example.healthrecord.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class HomeController {
//
//    @GetMapping("/")
//    public String home() {
//        return "main";  // templates/main.html 파일을 찾음
//    }
//}
//

package com.example.healthrecord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "main";  // templates/main.html 파일을 찾음
    }
}

