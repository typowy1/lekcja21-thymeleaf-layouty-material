package pl.javastart.lekcja21thymeleaflayoutymaterial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    //wspólne części dla strony internetowej

    //tworzymy maping na stornę główna
    @GetMapping("/")
    public String home() {
        return "home";
    }


    //maping na stronę regulaminu
    @GetMapping("/regulamin")
    public String regulamin() {
        return "regulamin";
    }
}
