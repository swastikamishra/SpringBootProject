package constructor.dependency;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import constructor.dependency.entity.Trainer;

@SpringBootApplication
public class ConstructorinjectionApplication {
	
	
	public Trainer trainer;

    public ConstructorinjectionApplication(Trainer trainer) {
        this.trainer = trainer;
    }

    @GetMapping
    public String getSubject()
    {
    	return trainer.getSubjectName();
    }

	public static void main(String[] args) {
		SpringApplication.run(ConstructorinjectionApplication.class, args);
	}

}
