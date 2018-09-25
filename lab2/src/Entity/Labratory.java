package Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;
import java.util.List;


/**
 * The persistent class for the labratory database table.
 * 
 */
@Entity
@NamedQuery(name="Labratory.findAll", query="SELECT l FROM Labratory l")
public class Labratory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String detailes;

	private String name;

	private String photo;

	//bi-directional many-to-one association to Equipment
	@OneToMany(mappedBy="labratory")
	private List<Equipment> equipments;

	//bi-directional many-to-one association to ExpNew
	@OneToMany(mappedBy="labratory")
	private List<ExpNew> expNews;

	//bi-directional many-to-one association to Expriment
	@OneToMany(mappedBy="labratory")
	private List<Expriment> expriments;

	//bi-directional one-to-one association to Operator
	@OneToOne(mappedBy="labratory")
	private Operator operator;

	public Labratory() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public List<Equipment> getEquipments() {
		return this.equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}

	public Equipment addEquipment(Equipment equipment) {
		getEquipments().add(equipment);
		equipment.setLabratory(this);

		return equipment;
	}

	public Equipment removeEquipment(Equipment equipment) {
		getEquipments().remove(equipment);
		equipment.setLabratory(null);

		return equipment;
	}

	public List<ExpNew> getExpNews() {
		return this.expNews;
	}

	public void setExpNews(List<ExpNew> expNews) {
		this.expNews = expNews;
	}

	public ExpNew addExpNew(ExpNew expNew) {
		getExpNews().add(expNew);
		expNew.setLabratory(this);

		return expNew;
	}

	public ExpNew removeExpNew(ExpNew expNew) {
		getExpNews().remove(expNew);
		expNew.setLabratory(null);

		return expNew;
	}

	public List<Expriment> getExpriments() {
		return this.expriments;
	}

	public void setExpriments(List<Expriment> expriments) {
		this.expriments = expriments;
	}

	public Expriment addExpriment(Expriment expriment) {
		getExpriments().add(expriment);
		expriment.setLabratory(this);

		return expriment;
	}

	public Expriment removeExpriment(Expriment expriment) {
		getExpriments().remove(expriment);
		expriment.setLabratory(null);

		return expriment;
	}

	public Operator getOperator() {
		return this.operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

}