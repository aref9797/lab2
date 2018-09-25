package Entity;

import java.io.Serializable;
import javax.persistence.*;

import AAA.Entity.Aauser;

import java.util.List;


/**
 * The persistent class for the enduser database table.
 * 
 */
@Entity
@NamedQuery(name="Enduser.findAll", query="SELECT e FROM Enduser e")
public class Enduser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private Integer hitpass;

	private Boolean isactive;
	
	private Long melicode;
	//uni-directional one-to-one association to Aauser
	@OneToOne
	@JoinColumn(name="user_id")
	private Aauser aauser;

	//bi-directional many-to-one association to ExpNew
	@OneToMany(mappedBy="enduser")
	private List<ExpNew> expNews;

	//bi-directional many-to-one association to Resrevation
	@OneToMany(mappedBy="enduser")
	private List<Resrevation> resrevations;

	public Enduser() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getHitpass() {
		return this.hitpass;
	}

	public void setHitpass(Integer hitpass) {
		this.hitpass = hitpass;
	}

	public Boolean getIsactive() {
		return this.isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public Aauser getAauser() {
		return this.aauser;
	}

	public void setAauser(Aauser aauser) {
		this.aauser = aauser;
	}

	public List<ExpNew> getExpNews() {
		return this.expNews;
	}

	public void setExpNews(List<ExpNew> expNews) {
		this.expNews = expNews;
	}

	public ExpNew addExpNew(ExpNew expNew) {
		getExpNews().add(expNew);
		expNew.setEnduser(this);

		return expNew;
	}

	public ExpNew removeExpNew(ExpNew expNew) {
		getExpNews().remove(expNew);
		expNew.setEnduser(null);

		return expNew;
	}

	public List<Resrevation> getResrevations() {
		return this.resrevations;
	}

	public void setResrevations(List<Resrevation> resrevations) {
		this.resrevations = resrevations;
	}

	public Resrevation addResrevation(Resrevation resrevation) {
		getResrevations().add(resrevation);
		resrevation.setEnduser(this);

		return resrevation;
	}

	public Resrevation removeResrevation(Resrevation resrevation) {
		getResrevations().remove(resrevation);
		resrevation.setEnduser(null);

		return resrevation;
	}

	/**
	 * @return the melicode
	 */
	public Long getMelicode() {
		return melicode;
	}

	/**
	 * @param melicode the melicode to set
	 */
	public void setMelicode(Long melicode) {
		this.melicode = melicode;
	}
	
}