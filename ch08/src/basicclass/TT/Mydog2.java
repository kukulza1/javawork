package basicclass.TT;

class Mydog2 {
	String name;
	String type;
	
	public Mydog2(String type, String name ) {
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		
		return type +" "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mydog2 d1 = new Mydog2("멍멍이","진돗개");
	    System.out.println(d1);
	}

}
