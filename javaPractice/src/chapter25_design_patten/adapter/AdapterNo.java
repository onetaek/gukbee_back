package chapter25_design_patten.adapter;

class ServiceA{
	void runWork() {
		System.out.println("work");
	}
}

class ServiceB{
	void runStudy() {
		System.out.println("study");
	}
}
//변환기의 역할은 서로다른 두 인터페이스 사이에 통신이 가능하게 하는 것
class AdapterServiceA{
	ServiceA serviceA = new ServiceA();
	void runService() {
		serviceA.runWork();
	}
}

class AdapterServiceB{
	ServiceB serviceB = new ServiceB();
	void runService() {
		serviceB.runStudy();
	}
}

public class AdapterNo {
	public static void main(String[] arg) {
//		ServiceA serviceA = new ServiceA();
//		ServiceB serviceB = new ServiceB();
//		
//		serviceA.runWork();
//		serviceB.runStudy();
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		//동일한 메서드 명을 사용할 수 있음.
		asa1.runService();
		asb1.runService();
		
	}
}
