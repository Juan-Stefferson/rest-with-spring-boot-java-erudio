package br.com.erudio.restwithspringbootjavaerudio.service;

import br.com.erudio.restwithspringbootjavaerudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public Person findPersonById(String id){
		logger.info("retorn a Person");
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Juan");
		person.setLasttName("Pereira");
		person.setGender("Male");
		person.setAddres("belem");
		return person;
	}
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return  persons;
		
	}
	
	private Person mockPerson(int i) {
		logger.info("retorn a Person");
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("name" + i);
		person.setLasttName("name" + i);
		person.setGender("gender" + i);
		person.setAddres("city" + i );
		return person;
	}
	
	public Person createPerson(Person person){
		logger.info("Creating a person");
		return person;
		
	}
	
	public Person updatePerson(Person person){
		logger.info("Creating a person");
		return person;
	}
	
	public void deletePerson(String id){
		logger.info("Deleting a person");
	}
}
