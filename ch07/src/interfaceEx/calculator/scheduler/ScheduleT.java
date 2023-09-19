package interfaceEx.calculator.scheduler;

import java.io.IOException;

public class ScheduleT {

	public static void main(String[] args) throws IOException {
		/*Scheduler schd1 = new LeastJob();
		schd1.getNextCall();
		schd1.sendCallToAgent();*/
		
		//인터페이스 다형성구현
		System.out.println("전화상담 배분방식을 선택하세요");
		System.out.println("R:한명씩 차례로 배분");
		System.out.println("L:쉬고있거나 대기가 가장적은 상담원에게 배분");
		System.out.println("P:우선 순위가 높은 고객에게 먼저배분");
		
		//한 문자 입력-char인데int를 사용함(코드값)
		int ch = System.in.read();
		
		Scheduler sch = null;
		if(ch=='R'||ch=='r') {
			sch = new RoundRobin();
		}else if(ch=='L'||ch=='l'){
			sch = new LeastJob();
		}else if(ch=='P'||ch=='p') {
			sch = new priorityAllocation();
		}else {
			System.out.println("미지원 기능입니다.");
			//return;
			System.exit(0);
		}
		sch.getNextCall();
		sch.sendCallToAgent();
	}

}
