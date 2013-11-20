package tk.wangjinzone.businessledger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tk.wangjinzone.businessledger.pojo.BusinessLedger;
import tk.wangjinzone.businessledger.service.BusinessLedgerService;

@Controller
@RequestMapping(value = "/businessledger")
public class BusinessLedgerController {
	
	@Autowired
	BusinessLedgerService businessLedgerService;

	@RequestMapping(value="/index")
	public String index(Model model) {
		model.addAttribute("businessLedgers", businessLedgerService.index());
		return "businessledger/index";
	}

	@RequestMapping(value = "/show/{id}")
	public String show(@PathVariable Integer id,Model model) {
		model.addAttribute("businessLedger", businessLedgerService.show(id));
		return "businessledger/show";
	}

	@RequestMapping(value = "/new")
	public String _new() {
		return "businessledger/new";
	}

	@RequestMapping(value = "/create" ,method = RequestMethod.POST)
	public String create(BusinessLedger businessLedger) {
		this.businessLedgerService.create(businessLedger);
		return "redirect:/businessledger/show" + businessLedger.getId();
	}
}
