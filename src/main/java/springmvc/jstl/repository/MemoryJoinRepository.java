package springmvc.jstl.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import springmvc.jstl.domain.Person;

import java.util.HashMap;
import java.util.Map;

@Repository
@Slf4j
public class MemoryJoinRepository implements JoinRepository{
    private static Map<Long, Person> member = new HashMap<>();

    @Override
    public void save(Person person) {
        Long id = person.getId();
        member.put(id++, person);
        person.setId(id);
    }
}
