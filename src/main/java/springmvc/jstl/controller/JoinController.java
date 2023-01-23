package springmvc.jstl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.jstl.domain.Person;

@Controller
@RequestMapping("/join")
public class JoinController {

    @PostMapping
    public void joinForm(@RequestParam Person person){

    }
}
