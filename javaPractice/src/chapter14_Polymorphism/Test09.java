package chapter14_Polymorphism;



class Test09 {
	
	static void intro(Pet pet) {
		pet.introduce();
	}
	
	public static void main(String[] args) {
		Pet[] petArr = {
				new Pet("Kurt","아이"),
				new RobotPet("R2D2","루크"),
				new Pet("마이클","영진"),
		};
		
		for(Pet pet : petArr) {
			intro(pet);
			System.out.println();
		}

	}

}
