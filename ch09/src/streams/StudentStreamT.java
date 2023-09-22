package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(
				new Student("SB",90),
				new Student("KSB",95),
				new Student("GSB",94)
				);
		
		Stream<Student> stdStream = list.stream();
		stdStream.forEach(std->{
			//System.out.println(std.getName()+","+std.getScore());
		//});
		String name = std.getName();
		int score = std.getScore();
		System.out.println(name+":"+score);

	});
		//학생의 이름만 출력
		//map()-매개변수에 매핑(일치)되는 것을 구현할때 쓰는 함수
		//학생 객체에 있는 이름만 출력함
		stdStream=list.stream(); //스트림객체는 한번밖에 사용할수없으므로 다시 저장한것
		stdStream.map(std->std.getName())
		         .forEach(s->System.out.println(s));
		
		//학생 점수에 해당되는 내용만 출력
		//정수인 경우 - mapToInt
		stdStream = list.stream();
		stdStream.mapToInt(std->std.getScore()).forEach(n1->System.out.println(n1));
		
		//점수가 90점 이상인 학생의 이름 출력
		//filter()함수-조건에 일치되는 내용을 걸러낼때 사용
		System.out.println("====================");
		list.stream().filter(std->std.getScore()>=92)
		.map(std->std.getName()) .forEach(s->System.out.println(s));

}
}