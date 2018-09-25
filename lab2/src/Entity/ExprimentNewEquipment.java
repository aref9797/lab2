package Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the expriment_new_equipment database table.
 * 
 */
@Entity
@Table(name="expriment_new_equipment")
@NamedQuery(name="ExprimentNewEquipment.findAll", query="SELECT e FROM ExprimentNewEquipment e")
public class ExprimentNewEquipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	//bi-directional many-to-one association to Equipment
	@ManyToOne
	@JoinColumn(name="eqi_id")
	private Equipment equipment;

	//bi-directional many-to-one association to ExpNew
	@ManyToOne
	@JoinColumn(name="exp_new_id")
	private ExpNew expNew;

	public ExprimentNewEquipment() {
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

	public ExpNew getExpNew() {
		return this.expNew;
	}

	public void setExpNew(ExpNew expNew) {
		this.expNew = expNew;
	}

}