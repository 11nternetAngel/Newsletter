package com.project.newsletter.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class NewsletterView {

    @GetMapping(value = "/cadastro")
    public String cadastroEmail() {
        return "cadastro";
    }
}
