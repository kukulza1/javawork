package exceptions.resources;

public class MyresourceTest {

	public static void main(String[] args) throws Exception {
		Myresource rs1 = new Myresource("rs1");
		//System.out.println(rs1.read1());
		//System.out.println(rs1.read2());
		
		System.out.println(Integer.parseInt(rs1.read1()));
		System.out.println(Integer.parseInt(rs1.read2()));
		
		
			rs1.close();
		

	}

}
