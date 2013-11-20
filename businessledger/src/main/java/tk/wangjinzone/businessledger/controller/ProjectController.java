package tk.wangjinzone.businessledger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tk.wangjinzone.businessledger.pojo.Project;
import tk.wangjinzone.businessledger.service.ProjectService;

@Controller
@RequestMapping(value = "/project")
public class ProjectController {

	@Autowired
	ProjectService projectService;

	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("projects", projectService.index());
		return "project/index";
	}

	@RequestMapping(value = "/show/{id}")
	public String show(@PathVariable Integer id, Model model) {
		model.addAttribute("project", projectService.show(id));
		return "project/show";
	}

	@RequestMapping(value = "/new")
	public String _new() {
		return "project/new";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(Project project) {
		projectService.create(project);
		return "redirect:/project/show/" + project.getId();
	}

	public String edit() {
		return "project/edit";
	}

	public String update(Project project) {
		return "redirect:/project/show/" + project.getId();
	}

	public String destroy() {
		return "redirect:/project/index";
	}
}
