package exceptions.resources;

public class MyresourceTest2 {

	public static void main(String[] args) throws Exception {
		Myresource rs1 = null;
		try {
		rs1 = new Myresource("rs1");
		//System.out.println(rs1.read1());
		//System.out.println(rs1.read2());
		
		System.out.println(Integer.parseInt(rs1.read1()));
		System.out.println(Integer.parseInt(rs1.read2()));
		}catch(Exception e) {
	    e.printStackTrace();
		}finally {//리소스 닫는코드는 파이널리에 작성
			rs1.close();
		}
		
	}

}
