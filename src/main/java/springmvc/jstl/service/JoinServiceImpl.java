package springmvc.jstl.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springmvc.jstl.domain.Person;
import springmvc.jstl.repository.MemoryJoinRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class JoinServiceImpl implements JoinService{

    private final MemoryJoinRepository repository;

    @Override
    public void join(Person person) {
        repository.save(person);
    }
}
