package jobseeker.db;

import java.util.List;
import java.io.Serializable;

public class Person implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -64567603420449597L;
	
	private String name;
	private List<Job> jobs;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Job> getJobs() {
		return jobs;
	}
	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jobs == null) ? 0 : jobs.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (jobs == null) {
			if (other.jobs != null)
				return false;
		} else if (!jobs.equals(other.jobs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Person(String name, List<Job> jobs) {
		super();
		this.name = name;
		this.jobs = jobs;
	}
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", jobs=" + jobs + "]";
	}
	//By this way job is printing person and person is orinting person
	
	
	
	
}
