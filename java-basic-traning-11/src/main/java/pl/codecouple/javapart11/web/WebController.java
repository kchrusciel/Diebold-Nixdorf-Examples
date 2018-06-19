package pl.codecouple.javapart11.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.codecouple.javapart11.email.Email;
import pl.codecouple.javapart11.email.EmailRepository;

@Controller
class WebController {

    private final EmailRepository emailRepository;

    WebController(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @GetMapping
    String showMainPage() {
        return "index";
    }

    @GetMapping("/emails")
    ModelAndView showEmailListPage(ModelAndView modelAndView) {
        modelAndView.setViewName("emails");
        modelAndView.addObject("emails", emailRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/add-email")
    public String showAddEmailPage(Model model) {
        model.addAttribute("email", new Email());
        return "add-email";
    }

    @PostMapping("/add-email")
    public String addEmail(@ModelAttribute Email email) {
        emailRepository.save(email);
        return "redirect:/emails";
    }

}
