package tk.wangjinzone.businessledger.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_requestparams")
public class RequestParams implements Serializable {

	private static final long serialVersionUID = 749667925140225818L;
	
	private Integer id;
	
	private ParamsType paramsType;
	
	private String paramsName;
	
	private String paramsDescription;
	
	private BusinessLedger businessLedger;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne
	public ParamsType getParamsType() {
		return paramsType;
	}

	public void setParamsType(ParamsType paramsType) {
		this.paramsType = paramsType;
	}

	public String getParamsName() {
		return paramsName;
	}

	public void setParamsName(String paramsName) {
		this.paramsName = paramsName;
	}

	public String getParamsDescription() {
		return paramsDescription;
	}

	public void setParamsDescription(String paramsDescription) {
		this.paramsDescription = paramsDescription;
	}

	@ManyToOne
	public BusinessLedger getBusinessLedger() {
		return businessLedger;
	}

	public void setBusinessLedger(BusinessLedger businessLedger) {
		this.businessLedger = businessLedger;
	}


}
