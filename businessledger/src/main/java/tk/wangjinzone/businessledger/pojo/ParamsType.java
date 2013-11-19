package tk.wangjinzone.businessledger.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_paramstype")
public class ParamsType implements Serializable {

	private static final long serialVersionUID = -1359482805408278175L;
	
	private Integer id;
	
	private String paramsName;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getParamsName() {
		return paramsName;
	}

	public void setParamsName(String paramsName) {
		this.paramsName = paramsName;
	}
	
}
