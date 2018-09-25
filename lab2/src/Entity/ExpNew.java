package Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;
import java.util.List;


/**
 * The persistent class for the exp_new database table.
 * 
 */
@Entity
@Table(name="exp_new")
@NamedQuery(name="ExpNew.findAll", query="SELECT e FROM ExpNew e")
public class ExpNew implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String details;

	private String name;

	@Column(name="offer_price")
	private double offerPrice;

	private String photo;

	//bi-directional many-to-one association to Enduser
	@ManyToOne
	private Enduser enduser;

	//bi-directional many-to-one association to Labratory
	@ManyToOne
	@JoinColumn(name="lab_id")
	private Labratory labratory;

	//bi-directional many-to-one association to ExprimentNewEquipment
	@OneToMany(mappedBy="expNew")
	private List<ExprimentNewEquipment> exprimentNewEquipments;

	public ExpNew() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getOfferPrice() {
		return this.offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Enduser getEnduser() {
		return this.enduser;
	}

	public void setEnduser(Enduser enduser) {
		this.enduser = enduser;
	}

	public Labratory getLabratory() {
		return this.labratory;
	}

	public void setLabratory(Labratory labratory) {
		this.labratory = labratory;
	}

	public List<ExprimentNewEquipment> getExprimentNewEquipments() {
		return this.exprimentNewEquipments;
	}

	public void setExprimentNewEquipments(List<ExprimentNewEquipment> exprimentNewEquipments) {
		this.exprimentNewEquipments = exprimentNewEquipments;
	}

	public ExprimentNewEquipment addExprimentNewEquipment(ExprimentNewEquipment exprimentNewEquipment) {
		getExprimentNewEquipments().add(exprimentNewEquipment);
		exprimentNewEquipment.setExpNew(this);

		return exprimentNewEquipment;
	}

	public ExprimentNewEquipment removeExprimentNewEquipment(ExprimentNewEquipment exprimentNewEquipment) {
		getExprimentNewEquipments().remove(exprimentNewEquipment);
		exprimentNewEquipment.setExpNew(null);

		return exprimentNewEquipment;
	}

}