package Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(name="student_n")
	private Long studentN;

	//uni-directional one-to-one association to Enduser
	@OneToOne
	@JoinColumn(name="user_id")
	private Enduser enduser;

	public Student() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStudentN() {
		return this.studentN;
	}

	public void setStudentN(Long studentN) {
		this.studentN = studentN;
	}

	public Enduser getEnduser() {
		return this.enduser;
	}

	public void setEnduser(Enduser enduser) {
		this.enduser = enduser;
	}

}