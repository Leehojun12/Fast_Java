package polymorphism;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("동물의 움직임");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷는다");
	}
	public void readBooks(){
		System.out.println("사람은 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네발로 뛴다");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 한다");
	}
}
class Eagle extends Animal{
	public void move() {
			System.out.println("독수리가 하늘을 날아갑니다");
	}
	public void flying() {
		System.out.println("날개를 펼칩니다.");
	}
}
public class AnimalTest{
	public static void main(String[]args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		/*AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);*/
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		/*for(Animal animal : animalList) {
			animal.move();
		}*/
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
	
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i =0; i<list.size();i++) {
			Animal animal = list.get(i);
			
			if (animal instanceof Human) {
				Human human = (Human)animal; //readbook 보이기 위한....
				human.readBooks();
			}
			else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else {
				System.out.println("error");
			}
			
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}

