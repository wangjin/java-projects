package tk.wangjinzone.businessledger.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tk.wangjinzone.businessledger.pojo.Project;

@Component
@Transactional
@SuppressWarnings("unchecked")
public class ProjectDao extends BaseDao{

	public List<Project> index() {
		return this.getSession().createQuery("from Project").list();
	}

	public Project show(Integer id) {
		return (Project) this.getSession().get(Project.class, id);
	}

	public void create(Project project) {
		this.getSession().save(project);
	}

}
