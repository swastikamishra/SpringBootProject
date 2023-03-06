package subject.dependency.configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import subject.dependency.entity.Subject;
import subject.dependency.entity.Trainer;

@Configuration
public class DependencyConfiguration {
	
	@Bean
	public Subject subject ()
	{
       return new Subject ("IT");
  
    }
	
	@Bean
	public Trainer trainer ()
	{
       return new Trainer (subject());
  
    }
	
}