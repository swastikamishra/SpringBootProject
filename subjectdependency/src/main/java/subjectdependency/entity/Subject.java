package subjectdependency.entity;

import org.springframework.stereotype.Component;

public class Subject {

private String name;

public Subject(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


	
}
