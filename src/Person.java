
public class Person {
//composition has-a relationship
	private Job job;
	private Education edu;
	public Person(){
    	this.job=new Job();
    	job.setSalary(1000L);
    	job.setRole("programmer");
    	job.setId(567);
    	this.edu = new Education();
    	edu.setSchool(0, "Rutgers");
    	edu.setSchool(1, "OSU");
	}
	public long getSalary() {
    	return job.getSalary();
	}
	@Override
	public String toString(){
		return (job.toString() + "\n" + edu.toString());
	}
}