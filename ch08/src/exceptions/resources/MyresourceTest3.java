package exceptions.resources;

public class MyresourceTest3 {

	public static void main(String[] args) throws Exception {
		//try~~with~resource문
		//close()사용하지 않음
		
		try(Myresource rs1 = new Myresource("rs1")) {
		
		//System.out.println(rs1.read1());
		//System.out.println(rs1.read2());
		
		System.out.println(Integer.parseInt(rs1.read1()));
		System.out.println(Integer.parseInt(rs1.read2()));
		}catch(Exception e) {
	    e.printStackTrace();
		}
		
	}

}
