package tk.wangjinzone.businessledger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tk.wangjinzone.businessledger.dao.ProjectDao;
import tk.wangjinzone.businessledger.pojo.Project;

@Component
public class ProjectService {

	@Autowired
	ProjectDao projectDao;
	
	public List<Project> index(){
		return projectDao.index();
	}
	
	public Project show(Integer id){
		return projectDao.show(id);
	}

	public void create(Project project) {
		projectDao.create(project);
	}
}
