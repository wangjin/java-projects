package tk.wangjinzone.businessledger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tk.wangjinzone.businessledger.dao.BusinessLedgerDao;
import tk.wangjinzone.businessledger.pojo.BusinessLedger;

@Component
public class BusinessLedgerService {
	
	@Autowired
	BusinessLedgerDao businessLedgerDao;
	
	public List<BusinessLedger> index(){
		return businessLedgerDao.index();
	}
	
	public BusinessLedger show(Integer id){
		return businessLedgerDao.show(id);
	}
	
	public void create(BusinessLedger businessLedger){
		this.businessLedgerDao.create(businessLedger);
	}

}
