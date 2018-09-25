package Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the charge_payment database table.
 * 
 */
@Entity
@Table(name="charge_payment")
@NamedQuery(name="ChargePayment.findAll", query="SELECT c FROM ChargePayment c")
public class ChargePayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	//bi-directional many-to-one association to Professor
	@ManyToOne
	@JoinColumn(name="payer_id", referencedColumnName="user_id")
	private Professor professor;

	//bi-directional one-to-one association to Resrevation
	@OneToOne
	@JoinColumn(name="resrv_exp_id")
	private Resrevation resrevation;

	public ChargePayment() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Professor getProfessor() {
		return this.professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Resrevation getResrevation() {
		return this.resrevation;
	}

	public void setResrevation(Resrevation resrevation) {
		this.resrevation = resrevation;
	}

}