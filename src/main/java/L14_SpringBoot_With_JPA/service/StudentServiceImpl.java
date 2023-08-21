package L14_SpringBoot_With_JPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import L14_SpringBoot_With_JPA.entity.Student;
import L14_SpringBoot_With_JPA.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository repo;
	
	public Student updateById(Student student, int id) {
		Student stu = repo.findById(id).get();
		stu.setName(student.getName());
		stu.setEmail(student.getEmail());
		return repo.save(stu);
	}
	

}
