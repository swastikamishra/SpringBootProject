package subjectdependency.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import subjectdependency.entity.Trainer;


@RestController
public class TrainerController {
	
private Trainer trainer;
	
	public TrainerController(Trainer trainer) {
	super();
	this.trainer =  trainer;
}

@RequestMapping("/teach")
	public void teach ()
	{
		trainer.teach();
		
	}
	

}
