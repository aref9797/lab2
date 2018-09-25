package AAA.Entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the aauser database table.
 * 
 */
@Entity
@NamedQueries({ @NamedQuery(name = "Aauser.findAll", query = "SELECT a FROM Aauser a"),
@NamedQuery(name = "Aauser.findbyUsername", query = "SELECT a FROM Aauser a WHERE (a.username=:username)"),
@NamedQuery(name = "Aauser.findbyUserPass", query = "SELECT a FROM Aauser a WHERE (a.username=:username AND a.hpassword=:password)"),
@NamedQuery(name = "Aauser.findbyUserEmail", query = "SELECT a FROM Aauser a WHERE (a.username=:username AND a.email=:email)"),
@NamedQuery(name = "Aauser.findbyEmail", query = "SELECT a FROM Aauser a WHERE (a.email=:email)"),
@NamedQuery(name = "Aauser.findbyUserPassDeactives", query = "SELECT a FROM Aauser a WHERE (a.username=:username AND a.hpassword=:password)"),

})

public class Aauser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "aauser_id_seq")
	@SequenceGenerator(name="aauser_id_seq", sequenceName = "aauser_id_seq", allocationSize=1)
	private Long id;

	private String email;

	private String hpassword;

	private String mobile; String username;
	
	private String family;
	
	private String name;
	//bi-directional many-to-one association to Aasession
	@OneToMany(mappedBy="aauser")
	private List<Aasession> aasessions;
	
	//bi-directional many-to-one association to Aarole
	@ManyToOne
	@JoinColumn(name="roleid")
	private Aarole aarole;

	public Aauser() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHpassword() {
		return this.hpassword;
	}

	public void setHpassword(String hpassword) {
		this.hpassword = hpassword;
	}



	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Aasession> getAasessions() {
		return this.aasessions;
	}

	public void setAasessions(List<Aasession> aasessions) {
		this.aasessions = aasessions;
	}

	public Aasession addAasession(Aasession aasession) {
		getAasessions().add(aasession);
		aasession.setAauser(this);

		return aasession;
	}

	public Aasession removeAasession(Aasession aasession) {
		getAasessions().remove(aasession);
		aasession.setAauser(null);

		return aasession;
	}

	public Aarole getAarole() {
		return this.aarole;
	}

	public void setAarole(Aarole aarole) {
		this.aarole = aarole;
	}

	/**
	 * @return the family
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * @param family the family to set
	 */
	public void setFamily(String family) {
		this.family = family;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}