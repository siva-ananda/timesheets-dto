package be.steformations.sivananda.data.timesheets.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
public class EmployeeDto {

	private Long id;

	private String firstname;

	private String name;

	private String login;

	private String password;

	@XmlElementWrapper(name="managedProjects")
	@XmlElement(name="managedProject")
	private List<ProjectDto> managedProjects;

	@XmlElementWrapper(name="prestations")
	@XmlElement(name="prestation")
	private List<PrestationDto> prestations;

	
	public EmployeeDto() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<ProjectDto> getManagedProjects() {
		if (this.managedProjects == null) {
			this.managedProjects = new ArrayList<>();
		}
		return managedProjects;
	}


	public void setManagedProjects(List<ProjectDto> managedProjects) {
		this.managedProjects = managedProjects;
	}


	public List<PrestationDto> getPrestations() {
		if (this.prestations == null) {
			this.prestations = new ArrayList<>();
		}
		return prestations;
	}


	public void setPrestations(List<PrestationDto> prestations) {
		this.prestations = prestations;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((managedProjects == null) ? 0 : managedProjects.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((prestations == null) ? 0 : prestations.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDto other = (EmployeeDto) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (managedProjects == null) {
			if (other.managedProjects != null)
				return false;
		} else if (!managedProjects.equals(other.managedProjects))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (prestations == null) {
			if (other.prestations != null)
				return false;
		} else if (!prestations.equals(other.prestations))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", firstname=" + firstname + ", name=" + name + ", login=" + login
				+ ", password=" + password + ", managedProjects=" + managedProjects + ", prestations=" + prestations
				+ "]";
	}
	
}
