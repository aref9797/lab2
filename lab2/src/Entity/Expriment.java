package Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;
import java.util.List;


/**
 * The persistent class for the expriment database table.
 * 
 */
@Entity
@NamedQuery(name="Expriment.findAll", query="SELECT e FROM Expriment e")
public class Expriment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String details;

	private String name;

	private String photo;

	private double price;

	//bi-directional many-to-one association to Labratory
	@ManyToOne
	@JoinColumn(name="lab_id")
	private Labratory labratory;

	//bi-directional many-to-one association to ExprimentEquipment
	@OneToMany(mappedBy="expriment")
	private List<ExprimentEquipment> exprimentEquipments;

	//bi-directional many-to-one association to Resrevation
	@OneToMany(mappedBy="expriment")
	private List<Resrevation> resrevations;

	public Expriment() {
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

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Labratory getLabratory() {
		return this.labratory;
	}

	public void setLabratory(Labratory labratory) {
		this.labratory = labratory;
	}

	public List<ExprimentEquipment> getExprimentEquipments() {
		return this.exprimentEquipments;
	}

	public void setExprimentEquipments(List<ExprimentEquipment> exprimentEquipments) {
		this.exprimentEquipments = exprimentEquipments;
	}

	public ExprimentEquipment addExprimentEquipment(ExprimentEquipment exprimentEquipment) {
		getExprimentEquipments().add(exprimentEquipment);
		exprimentEquipment.setExpriment(this);

		return exprimentEquipment;
	}

	public ExprimentEquipment removeExprimentEquipment(ExprimentEquipment exprimentEquipment) {
		getExprimentEquipments().remove(exprimentEquipment);
		exprimentEquipment.setExpriment(null);

		return exprimentEquipment;
	}

	public List<Resrevation> getResrevations() {
		return this.resrevations;
	}

	public void setResrevations(List<Resrevation> resrevations) {
		this.resrevations = resrevations;
	}

	public Resrevation addResrevation(Resrevation resrevation) {
		getResrevations().add(resrevation);
		resrevation.setExpriment(this);

		return resrevation;
	}

	public Resrevation removeResrevation(Resrevation resrevation) {
		getResrevations().remove(resrevation);
		resrevation.setExpriment(null);

		return resrevation;
	}

}