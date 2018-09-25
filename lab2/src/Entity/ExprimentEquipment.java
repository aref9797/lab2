package Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the expriment_equipment database table.
 * 
 */
@Entity
@Table(name="expriment_equipment")
@NamedQuery(name="ExprimentEquipment.findAll", query="SELECT e FROM ExprimentEquipment e")
public class ExprimentEquipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	//bi-directional many-to-one association to Equipment
	@ManyToOne
	@JoinColumn(name="eqi_id")
	private Equipment equipment;

	//bi-directional many-to-one association to Expriment
	@ManyToOne
	@JoinColumn(name="exp_id")
	private Expriment expriment;

	public ExprimentEquipment() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Equipment getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Expriment getExpriment() {
		return this.expriment;
	}

	public void setExpriment(Expriment expriment) {
		this.expriment = expriment;
	}

}