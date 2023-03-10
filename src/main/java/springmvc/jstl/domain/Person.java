package springmvc.jstl.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter @Setter
public class Person {

    public Long id = 1L;
    public String name;
    public String age;
    public String gender;
    public String[] hobby;

    public MultipartFile file;

}
