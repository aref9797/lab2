package Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the charge database table.
 * 
 */
@Entity
@NamedQuery(name="Charge.findAll", query="SELECT c FROM Charge c")
public class Charge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private double amount;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name="professor_id")
	private Long professorId;

	public Charge() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getProfessorId() {
		return this.professorId;
	}

	public void setProfessorId(Long professorId) {
		this.professorId = professorId;
	}

}