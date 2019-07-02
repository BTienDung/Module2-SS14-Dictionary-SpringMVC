package com.codegym.controller;

import com.codegym.persistence.DictionaryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    DictionaryImpl dictionary = new DictionaryImpl();
    @RequestMapping(value = "/form")
    public String showForm(Model model){

        return "/form";
    }

    @RequestMapping(value = "search")
    public String result(@RequestParam("eng") String eng,Model model){
        String search = dictionary.translate(eng);
        model.addAttribute("search", search);
        return "/search";
    }
}
