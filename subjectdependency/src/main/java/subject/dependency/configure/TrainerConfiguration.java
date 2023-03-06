package subject.dependency.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import subjectdependency.entity.Subject;
import subjectdependency.entity.Trainer;

@Configuration
public class TrainerConfiguration {
	
	@Bean
	public Subject subject ()
	{
	 return new Subject("IT");	
	}
	
	@Bean
	public Trainer trainer ()
	{
	 return new Trainer (subject());	
	}

}
