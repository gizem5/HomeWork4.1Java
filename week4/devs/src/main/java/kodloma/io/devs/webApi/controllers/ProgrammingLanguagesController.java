package kodloma.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodloma.io.devs.business.abstracts.IProgrammingLanguagesService;
import kodloma.io.devs.entities.concretes.ProgrammingLanguages;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
	private IProgrammingLanguagesService _programmingLanguagesService;

	@Autowired
	public ProgrammingLanguagesController(IProgrammingLanguagesService programmingLanguagesService) {
		_programmingLanguagesService = programmingLanguagesService;
	}
	
	@GetMapping("/getAll")
	public List<ProgrammingLanguages> getAl1(){
		return _programmingLanguagesService.getAll();
	}
		
	@PostMapping("/add")
	public void add(ProgrammingLanguages language)throws Exception{
		_programmingLanguagesService.add(language);
	}
	
	@DeleteMapping("/delete")
	public void delete(ProgrammingLanguages language) {
		 _programmingLanguagesService.delete(language);
	}
	
	@PutMapping("/update")
	public void update(int id, String newName) throws Exception{
	     _programmingLanguagesService.update(id, newName);
	}
		
	@GetMapping("/getById/{id}")
	public void getById(int id) {
		_programmingLanguagesService.getById(id);
	}
}
	

