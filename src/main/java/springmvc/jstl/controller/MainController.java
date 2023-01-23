package springmvc.jstl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
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
    public ModelAndView join(){
        ModelAndView mv = new ModelAndView();
        Person returnPerson = Person.builder().build();

        mv.addObject("person",returnPerson);
        mv.setViewName("join");
        return mv;
    }
}
