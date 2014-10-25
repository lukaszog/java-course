package pl.umk.course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.umk.course.exceptions.EncodingException;
import pl.umk.course.utils.Encoder;

@RestController
public class EncodeController {

    private final Encoder encoder;

    @RequestMapping("/")
    public String index() {
        return "Hello Spring!";
    }

    @RequestMapping(value = "/encode", method = RequestMethod.GET)
    public String encode() throws EncodingException {
        return encoder.encrypt("hello");
    }

    @Autowired
    public EncodeController(Encoder encoder) {
        this.encoder = encoder;
    }
}