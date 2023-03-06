package constructor.dependency.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Trainer {
	
	private Subject subject;
@Autowired
    public Trainer(Subject subject) {
        this.subject = subject;
    }

    public String getSubjectName() {
        return subject.getName();
    }

}
