class Car {
	String color;
	int speed;

	void upSpeed(int value) {
		speed += value;
	}

	void downSpeed(int value) {
		speed -= value;
	}
}
	public class Ex11_01 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Car myCar1 = new Car();
			myCar1.color = "Red";
			myCar1.speed = 0;
			
			Car myCar2 = new Car();
			myCar2.color = "Blue";
			myCar2.speed = 0;
			
			Car myCar3 = new Car();
			myCar3.color = "Yellow";
			myCar3.speed = 0;
			myCar1.upSpeed(30);
			System.out.println("자동차 1의 색상은" + myCar1.color + "이며, 현재속도는 "
					+ myCar1.speed);
			
			myCar2.upSpeed(60);
			System.out.println("자동차 1의 색상은" + myCar2.color + "이며, 현재속도는 "
					+ myCar2.speed);
			myCar3.upSpeed(0);
			
			System.out.println("자동차 1의 색상은" + myCar3.color + "이며, 현재속도는 "
					+ myCar3.speed);
			
			
			myCar1 = null;
			myCar2 = null;
			myCar3 = null;

		}

	}

