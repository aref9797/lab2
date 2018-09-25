package Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the professor database table.
 * 
 */
@Entity
@NamedQuery(name="Professor.findAll", query="SELECT p FROM Professor p")
public class Professor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private double charge;

	//bi-directional many-to-one association to ChargePayment
	@OneToMany(mappedBy="professor")
	private List<ChargePayment> chargePayments;

	//uni-directional one-to-one association to Enduser
	@OneToOne
	@JoinColumn(name="user_id")
	private Enduser enduser;

	public Professor() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getCharge() {
		return this.charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public List<ChargePayment> getChargePayments() {
		return this.chargePayments;
	}

	public void setChargePayments(List<ChargePayment> chargePayments) {
		this.chargePayments = chargePayments;
	}

	public ChargePayment addChargePayment(ChargePayment chargePayment) {
		getChargePayments().add(chargePayment);
		chargePayment.setProfessor(this);

		return chargePayment;
	}

	public ChargePayment removeChargePayment(ChargePayment chargePayment) {
		getChargePayments().remove(chargePayment);
		chargePayment.setProfessor(null);

		return chargePayment;
	}

	public Enduser getEnduser() {
		return this.enduser;
	}

	public void setEnduser(Enduser enduser) {
		this.enduser = enduser;
	}

}