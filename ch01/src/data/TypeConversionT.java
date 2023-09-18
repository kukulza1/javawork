package data;

public class TypeConversionT {

	public static void main(String[] args) {
		// 형 변환- 1.자동형변환, 2.강제형변환
		int iNum=20;
		float fNum= iNum; //실수형 = 정수형
		
		System.out.println(iNum);//20
		System.out.println(fNum);//20.0
		
		double dNum; //실수형 8byte
		dNum = iNum + fNum;//40.0 //자동형변환(묵시적)
		 System.out.println(dNum);
		 
		 //2.강제형변환(casting)
		 double dNum1 = 1.2;
		 float fNum1= 0.9f; //f붙혀서 구분
		 int iNum1 = (int)dNum1 + (int)fNum1;//1.2=>1, 0.9=>0 ==>1+0
		 System.out.println(iNum1);
		 
		 int iNum2 = (int)(dNum1+fNum1);//1.2+0.9=>2.1=>2
		 System.out.println(iNum2);

	}

}
