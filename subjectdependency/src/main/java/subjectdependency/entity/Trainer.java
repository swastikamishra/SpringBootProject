package subjectdependency.entity;


import org.springframework.stereotype.Component;

@Component

public class Trainer {
	
private Subject subject;

public Trainer(Subject subject) {
	super();
	this.subject = subject;
}

public void teach()
{
	System.out.println("Trainer is teaching "+ subject.getName());
}


}
