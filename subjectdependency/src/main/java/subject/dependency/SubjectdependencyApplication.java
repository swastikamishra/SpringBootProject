package subject.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import subjectdependency.entity.Subject;
import subjectdependency.entity.Trainer;

@SpringBootApplication
public class SubjectdependencyApplication {
public static void main(String[] args) {
		SpringApplication.run(SubjectdependencyApplication.class, args);
	}

}
