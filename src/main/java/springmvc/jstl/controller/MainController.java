package springmvc.jstl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import springmvc.jstl.domain.Person;

@Controller
@RequestMapping("/")
@Slf4j
public class MainController {

    @GetMapping({"/","/main"})
    public String index(){
        return "index";
    }

    @GetMapping("/join")
    public String join(Model model){
        Person person = new Person();
        model.addAttribute("person", person);

        return "join";
    }
}
