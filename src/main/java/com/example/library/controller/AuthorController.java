package com.example.library.controller;

import com.example.library.model.Author;
import com.example.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public String listAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }

    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("author", new Author());
        return "authors/form";
    }

    @PostMapping("/save")
    public String saveAuthor(@ModelAttribute Author author) {
        authorRepository.save(author);
        return "redirect:/authors";
    }
    
    @GetMapping("/{id}")
public String viewAuthorDetails(@PathVariable Long id, Model model) {
    Author author = authorRepository.findById(id).orElse(null);
    model.addAttribute("author", author);
    return "authors/details";
}

@GetMapping("/edit/{id}")
public String showEditForm(@PathVariable Long id, Model model) {
    Author author = authorRepository.findById(id).orElse(null);
    model.addAttribute("author", author);
    return "authors/form";
}

@GetMapping("/delete/{id}")
public String deleteAuthor(@PathVariable Long id) {
    authorRepository.deleteById(id);
    return "redirect:/authors";
}

}
