package singleTon.student;

public class School {
	private static int serialNum = 0 ;
    private int student;
    
    public School() {
    	serialNum++;
    	student=serialNum;
    }
    
    public int getStudent() {
    	return student;
    }
}
