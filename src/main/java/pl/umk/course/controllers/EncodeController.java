package pl.umk.course.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncodeController {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring!";
    }
}