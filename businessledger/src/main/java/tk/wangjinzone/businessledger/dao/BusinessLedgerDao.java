package tk.wangjinzone.businessledger.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tk.wangjinzone.businessledger.pojo.BusinessLedger;

@Component
@Transactional
@SuppressWarnings("unchecked")
public class BusinessLedgerDao extends BaseDao {
	
	public List<BusinessLedger> index(){
		return this.getSession().createQuery("from BusinessLedger").list();
	}
	
	public BusinessLedger show(Integer id){
		return (BusinessLedger) this.getSession().get(BusinessLedger.class, id);
	}
	
	public void create(BusinessLedger businessLedger){
		this.getSession().save(businessLedger);
	}
}
