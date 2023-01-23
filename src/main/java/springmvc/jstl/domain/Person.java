package springmvc.jstl.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter @Setter @Builder
public class Person {

    public final String name;
    public final String age;
    public final String gender;
    public final String[] hobby;
    public final MultipartFile file;

}
