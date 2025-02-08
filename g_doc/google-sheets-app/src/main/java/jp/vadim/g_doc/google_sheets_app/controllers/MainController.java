package jp.vadim.g_doc.google_sheets_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")  // Главная страница
    public String home(Model model) {
        model.addAttribute("message", "Привет, мир!");
        return "index";  // Должен соответствовать имени Thymeleaf-шаблона
    }
}
