package tk.wangjinzone.businessledger.pojo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_project")
public class Project implements Serializable {

	private static final long serialVersionUID = 174487865708628417L;

	private Integer id;

	private String projectName;
	
	private User user;
	
	Set<BusinessLedger> businessLedgers;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "projectname")
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@OneToMany(mappedBy = "project",cascade = CascadeType.REMOVE)
	public Set<BusinessLedger> getBusinessLedgers() {
		return businessLedgers;
	}

	public void setBusinessLedgers(Set<BusinessLedger> businessLedgers) {
		this.businessLedgers = businessLedgers;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
