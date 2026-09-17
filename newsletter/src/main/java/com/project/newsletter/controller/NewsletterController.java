package com.project.newsletter.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class NewsletterController {
    
    ArrayList<String> emails = new ArrayList<>();


    @GetMapping(value = "/listar")
    public ArrayList<String> listEmails() {
        return this.emails;
    }

        @PostMapping(value = "/salvar")
        public String salvarEmail(@RequestParam String email) {

        if (email == null || email.trim().isEmpty()) {
            return "Inválido.";
        }

        int indexArroba = email.indexOf("@");
        if (indexArroba == -1) {
            return "Inválido.";
        }

        String dominio = email.substring(indexArroba + 1, email.length());

        if (dominio.equals("aluno.sed.gov.sc.br")) {
            this.emails.add(email);
            return "Salvo com sucesso!";
        } else {
            return "Inválido.";
        }
    }
}
