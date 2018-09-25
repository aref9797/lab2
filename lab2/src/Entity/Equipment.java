package Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;
import java.util.List;


/**
 * The persistent class for the equipment database table.
 * 
 */
@Entity
@NamedQuery(name="Equipment.findAll", query="SELECT e FROM Equipment e")
public class Equipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private Long barcode;

	private String detailes;

	private String name;

	@Column(name="p_yesr")
	private String pYesr;

	private String photo;

	//bi-directional many-to-one association to Labratory
	@ManyToOne
	@JoinColumn(name="lab_id")
	private Labratory labratory;

	//bi-directional many-to-one association to ExprimentEquipment
	@OneToMany(mappedBy="equipment")
	private List<ExprimentEquipment> exprimentEquipments;

	//bi-directional many-to-one association to ExprimentNewEquipment
	@OneToMany(mappedBy="equipment")
	private List<ExprimentNewEquipment> exprimentNewEquipments;

	public Equipment() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBarcode() {
		return this.barcode;
	}

	public void setBarcode(Long barcode) {
		this.barcode = barcode;
	}

	public String getDetailes() {
		return this.detailes;
	}

	public void setDetailes(String detailes) {
		this.detailes = detailes;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPYesr() {
		return this.pYesr;
	}

	public void setPYesr(String pYesr) {
		this.pYesr = pYesr;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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
		exprimentEquipment.setEquipment(this);

		return exprimentEquipment;
	}

	public ExprimentEquipment removeExprimentEquipment(ExprimentEquipment exprimentEquipment) {
		getExprimentEquipments().remove(exprimentEquipment);
		exprimentEquipment.setEquipment(null);

		return exprimentEquipment;
	}

	public List<ExprimentNewEquipment> getExprimentNewEquipments() {
		return this.exprimentNewEquipments;
	}

	public void setExprimentNewEquipments(List<ExprimentNewEquipment> exprimentNewEquipments) {
		this.exprimentNewEquipments = exprimentNewEquipments;
	}

	public ExprimentNewEquipment addExprimentNewEquipment(ExprimentNewEquipment exprimentNewEquipment) {
		getExprimentNewEquipments().add(exprimentNewEquipment);
		exprimentNewEquipment.setEquipment(this);

		return exprimentNewEquipment;
	}

	public ExprimentNewEquipment removeExprimentNewEquipment(ExprimentNewEquipment exprimentNewEquipment) {
		getExprimentNewEquipments().remove(exprimentNewEquipment);
		exprimentNewEquipment.setEquipment(null);

		return exprimentNewEquipment;
	}

}