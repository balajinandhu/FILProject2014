
package package1;

import javax.persistence.*;

import java.util.*;


public class ProjectInfoService {
	private EntityManager manager;
	public ProjectInfoService(EntityManager manager) {
		this.manager = manager;
	}
	// method to create a new record
	public ProjectInfo createProject(int project_ID, String projectname, String desc, String status,
			String tags, Date startdate, Date enddate, int budget, String outcome) {
		ProjectInfo project = new ProjectInfo();
		project.setProject_ID(project_ID);
		project.setProject_name(projectname);
		project.setProject_description(desc);
		project.setStatus(status);
		project.setTags(tags);
		project.setStartDate(startdate);
		project.setEndDate(enddate);
		project.setEstimated_budget(budget);
		project.setOutcome(outcome);
		manager.persist(project);
		return project;
	}

	// method to read a record
	public ProjectInfo readProject(String courseNumber) {
		ProjectInfo project = manager.find(ProjectInfo.class, courseNumber);
		return project; 
	}
	// method to read all records
	public List<ProjectInfo> readAll() {
		TypedQuery<ProjectInfo> query = manager.createQuery("SELECT e FROM ProjectInfo e", ProjectInfo.class);
		List<ProjectInfo> result = query.getResultList();
		return result; 
	}

	// method to update a record
	public ProjectInfo updateProject(int project_ID, String projectname, String desc, 
			String status, String tags, Date startDate, Date endDate,
			int budget, String outcome) {
		ProjectInfo project = manager.find(ProjectInfo.class, project_ID);
		if (project != null) {
			//ProjectInfo project = new ProjectInfo();
			project.setProject_ID(project_ID);
			project.setProject_name(projectname);
			project.setProject_description(desc);
			project.setStatus(status);
			project.setTags(tags);
			project.setStartDate(startDate);
			project.setEndDate(endDate);
			project.setEstimated_budget(budget);
			project.setOutcome(outcome);
			manager.persist(project);

		}
		return project;
	}

	// method to delete a record
	public void deleteProject(String projectname) {
		ProjectInfo project = manager.find(ProjectInfo.class, projectname);
		System.out.println(project);
		if (project != null) {
			manager.remove(project);
		}
	}
}
