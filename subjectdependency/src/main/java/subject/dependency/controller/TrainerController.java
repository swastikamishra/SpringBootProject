package subject.dependency.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import subject.dependency.entity.Trainer;


@RestController
public class TrainerController {
	
	private Trainer tariner;

	public TrainerController(Trainer tariner) {
		super();
		this.tariner = tariner;
	}
	
	@GetMapping("/teach")
	public String teach()
	{
		tariner.teach();
		
		return "Training completed sucessfully!";
	}

}
