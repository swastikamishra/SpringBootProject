package constructor.dependency.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import constructor.dependency.entity.Subject;
import constructor.dependency.entity.Trainer;

@Component
public class ConstructorConfig {
	
	@Bean
    public Subject subject() {
        return new Subject("Math");
    }

    @Bean
    public Trainer trainer(Subject subject) {
        return new Trainer(subject);
    }

}
