
public class Education {
	
	private String[] schools = {"","","","","","","","","",""};
	public Education(){
	}
	public void setSchool(int index, String name){
		schools[index] = name;
	}
	public String getSchool(int index){
		return schools[index];
	}
	@Override
	public String toString(){
		String it = "schools:\n";
		for (int i = 0;i<10;i++){
			it = it + schools[i] + "\n";			
		}
		return it;
	}
}
