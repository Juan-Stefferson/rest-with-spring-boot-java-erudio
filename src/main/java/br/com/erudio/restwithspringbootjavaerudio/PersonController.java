package br.com.erudio.restwithspringbootjavaerudio;

import br.com.erudio.restwithspringbootjavaerudio.model.Person;
import br.com.erudio.restwithspringbootjavaerudio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping(value = "/{id}")
	public Person findPerson(@PathVariable(value = "id") String id) throws Exception {
		
		return service.findPersonById(id);
		
	}
	
	@GetMapping()
	public List<Person> findAll() {
		
		return service.findAll();
		
	}
	
	@PostMapping()
	public Person createPerson(@RequestBody Person person) throws Exception {
		
		return service.createPerson(person);
		
	}
	
	
	@PutMapping()
	public Person UpdatePerson(@RequestBody Person person) throws Exception {
		
		return service.updatePerson(person);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable(value = "id") String id) throws Exception {
		
		service.deletePerson(id);
		
	}
	
}
