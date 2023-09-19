package interfaceEx.calculator.scheduler;

public class priorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
     System.out.println("고객 등급이 더높은 고객의전화를 먼저가져오기");		
	}

	@Override
	public void sendCallToAgent() {
          System.out.println("업무 스킬이 높은 상담원에게 우선배분");		
	}

}
