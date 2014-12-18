package pl.umk.course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.umk.course.repositories.EncodingEntityRepository;

@Controller
public class FrontendController {

    private final EncodingEntityRepository repository;

    @RequestMapping("/hello")
    public String indexAction(ModelMap model) {
        model.addAttribute("name", "Mirek");
        return "template";
    }

    @RequestMapping("/list")
    public String listAction(ModelMap model) {
        model.addAttribute("words", repository.findAll());
        return "list";
    }

    @Autowired
    public FrontendController(EncodingEntityRepository repository) {

        this.repository = repository;
    }
}
