package L14_SpringBoot_With_JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@ToString

@Entity
@Table(name="sb-jpa-student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@lombok.NonNull
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="roll")
	private int roll;

	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
}
