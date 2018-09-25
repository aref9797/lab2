package Entity;

import java.io.Serializable;
import javax.persistence.*;

import AAA.Entity.Aauser;


/**
 * The persistent class for the operator database table.
 * 
 */
@Entity
@NamedQuery(name="Operator.findAll", query="SELECT o FROM Operator o")
public class Operator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	//uni-directional one-to-one association to Aauser
	@OneToOne
	@JoinColumn(name="user_id")
	private Aauser aauser;

	//bi-directional one-to-one association to Labratory
	@OneToOne
	@JoinColumn(name="lab_id")
	private Labratory labratory;

	public Operator() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aauser getAauser() {
		return this.aauser;
	}

	public void setAauser(Aauser aauser) {
		this.aauser = aauser;
	}

	public Labratory getLabratory() {
		return this.labratory;
	}

	public void setLabratory(Labratory labratory) {
		this.labratory = labratory;
	}

}