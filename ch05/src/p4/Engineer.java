package p4;

public class Engineer extends Employee{ //생성자 필요
	
		//오류원인 -엠플로이 생성자를 상속받지 않음
	//결함조치 -super()를사용하여 생성자를 상속받음
	
	private String skillset;
	public Engineer(String name) {
		super(name);
		
	}
	
	public String getskillset() {
		return skillset;
	}
     public void setSkillSet(String skillset) { //strin오타
     this.skillset =skillset; //this.S(오타)killset =skillset;
    		 }
}
