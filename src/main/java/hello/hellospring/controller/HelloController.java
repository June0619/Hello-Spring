package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @AUTHOR        : JUNG JI WOON
 * @DATE-TIME    : 2021-01-01 오후 12:07
 * @NOTE        :
 */
@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");

        return "hello";
    }
}
