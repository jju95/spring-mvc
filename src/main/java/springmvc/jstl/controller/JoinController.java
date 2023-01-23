package springmvc.jstl.controller;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.jstl.domain.Person;
import springmvc.jstl.service.JoinServiceImpl;

@Slf4j
@Controller
@NoArgsConstructor
@RequestMapping("/join")
public class JoinController {

    private static JoinServiceImpl joinServiceImpl;

    @PostMapping
    public void joinForm(@Validated @ModelAttribute Person person){ // @RequestBody

        joinServiceImpl.join(person);
    }
}
