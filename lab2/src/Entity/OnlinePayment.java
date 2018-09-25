package Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the online_payment database table.
 * 
 */
@Entity
@Table(name="online_payment")
@NamedQuery(name="OnlinePayment.findAll", query="SELECT o FROM OnlinePayment o")
public class OnlinePayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	//bi-directional one-to-one association to Resrevation
	@OneToOne
	@JoinColumn(name="resrv_exp_id")
	private Resrevation resrevation;

	public OnlinePayment() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Resrevation getResrevation() {
		return this.resrevation;
	}

	public void setResrevation(Resrevation resrevation) {
		this.resrevation = resrevation;
	}

}