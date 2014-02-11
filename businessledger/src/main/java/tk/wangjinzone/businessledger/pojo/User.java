package tk.wangjinzone.businessledger.pojo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class User implements Serializable {

	private static final long serialVersionUID = -8386913751470032096L;

	private Integer id;

	private String username;

	private String password;
	
	private String realName;
	
	private Set<BusinessLedger> businessLedgers;
	
	private Set<Project> projects;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
	public Set<BusinessLedger> getBusinessLedgers() {
		return businessLedgers;
	}

	public void setBusinessLedgers(Set<BusinessLedger> businessLedgers) {
		this.businessLedgers = businessLedgers;
	}

	@OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	
}
