package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("James", 5000);
		Student student2 = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		student1.takeBus(bus100);
		Subway sub1 = new Subway(2);
		student2.takeSubway(sub1);
		
		student1.showInfo();
		student2.showInfo();
		
		bus100.showBusInfo();
		sub1.showSubwayInfo();

	}

}
