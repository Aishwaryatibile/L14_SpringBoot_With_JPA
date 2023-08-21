package L14_SpringBoot_With_JPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import L14_SpringBoot_With_JPA.entity.Student;
import L14_SpringBoot_With_JPA.repository.StudentRepository;
import L14_SpringBoot_With_JPA.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String test() {
		return "API works!";
	}
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return repo.save(student);
	}
	
	@GetMapping("/get/all")
	public List<Student> findAll() {
		return repo.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Student getById(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/update/{id}")
	public Student updateById(@RequestBody Student student, @PathVariable int id) {
		return service.updateById(student, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		repo.deleteById(id);
		return "Student deleted successfully!";
	}

}
