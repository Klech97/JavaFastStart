package jp.vadim.g_doc.google_sheets_app.controllers;

import jp.vadim.g_doc.google_sheets_app.services.GoogleSheetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormController {
    @Autowired
    private GoogleSheetsService googleSheetsService;

    @PostMapping("/submit")
    public String submitForm(@RequestParam("name") String name,
                             @RequestParam("email") String email,
                             @RequestParam("message") String message,
                             RedirectAttributes redirectAttributes) {
        try {
            googleSheetsService.addDataToGoogleSheet(name, email, message);
            redirectAttributes.addFlashAttribute("success", "Данные успешно отправлены!");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Ошибка при отправке данных: " + e.getMessage());
        }
        return "redirect:/";
    }
}