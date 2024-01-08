package com.hendisantika.springboottailwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-tailwind
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/8/24
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("title", "Spring Boot x Tailwind CSS");

        return "home";
    }
}
