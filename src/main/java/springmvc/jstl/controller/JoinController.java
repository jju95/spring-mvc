package springmvc.jstl.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springmvc.jstl.domain.Person;
import springmvc.jstl.service.JoinServiceImpl;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/join")
public class JoinController {

    private final JoinServiceImpl joinServiceImpl;

    @PostMapping
    public String joinForm(@ModelAttribute("person") Person person, Model model){
        joinServiceImpl.join(person);
        model.addAttribute("person", person);
        return "result";
    }
}
