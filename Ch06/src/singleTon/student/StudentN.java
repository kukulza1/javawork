package singleTon.student;

public class StudentN {
	private static StudentN instance;
	
	private StudentN() {}
	
	public static StudentN getInstance() {
		if(instance==null) {
			instance=new StudentN();
		}
		return instance;
	}  
        public School SNum() {
        	School sn1 = new School();
        	return sn1;
        }
}
