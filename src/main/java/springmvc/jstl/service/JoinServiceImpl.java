package springmvc.jstl.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springmvc.jstl.domain.Person;

@Slf4j
@Service
public class JoinServiceImpl implements JoinService{
    @Override
    public void join(Person person) {
        log.info("test");
    }
}
