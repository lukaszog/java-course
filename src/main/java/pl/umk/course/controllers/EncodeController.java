package pl.umk.course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.umk.course.exceptions.EncodingException;
import pl.umk.course.utils.Encoder;

import javax.servlet.http.HttpServletResponse;

@RestController
public class EncodeController {

    private final Encoder encoder;

    @RequestMapping("/")
    public String index() {
        return "Hello Spring!";
    }

    @RequestMapping(value = "/encode/{text}", method = RequestMethod.GET)
    public String encode(@PathVariable String text, HttpServletResponse response) {
        try {
            return encoder.encrypt(text);
        } catch (EncodingException e) {
            response.setStatus(400);
            return "Invalid text...";
        }
    }

    @Autowired
    public EncodeController(Encoder encoder) {
        this.encoder = encoder;
    }
}