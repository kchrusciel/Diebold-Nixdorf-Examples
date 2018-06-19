package pl.codecouple.javapart10.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class WebController {

    @GetMapping("/about")
    String showAboutPage() {
        return "about";
    }

    @GetMapping
    String showMainPage() {
        return "index";
    }

}
