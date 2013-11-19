package tk.wangjinzone.businessledger.pojo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_businessledger")
public class BusinessLedger implements Serializable {

	private static final long serialVersionUID = -1560139996954520944L;

	private Integer id;

	private String requestUrl;

	private User user;
	
	private String description;
	
	private Project project;
	

	private Set<RequestParams> requestParams;

	private Set<ResponseParams> responseParams;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(mappedBy = "businessLedger", cascade = CascadeType.REMOVE)
	public Set<RequestParams> getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(Set<RequestParams> requestParams) {
		this.requestParams = requestParams;
	}

	@OneToMany(mappedBy = "businessLedger", cascade = CascadeType.REMOVE)
	public Set<ResponseParams> getResponseParams() {
		return responseParams;
	}

	public void setResponseParams(Set<ResponseParams> responseParams) {
		this.responseParams = responseParams;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToOne
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	

}
