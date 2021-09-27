package polymorphism;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("������ ������");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �ȴ´�");
	}
	public void readBooks(){
		System.out.println("����� å�� �н��ϴ�.");
	}
}
class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ڴ�");
	}
	public void hunting() {
		System.out.println("ȣ���̴� ����� �Ѵ�");
	}
}
class Eagle extends Animal{
	public void move() {
			System.out.println("�������� �ϴ��� ���ư��ϴ�");
	}
	public void flying() {
		System.out.println("������ ��Ĩ�ϴ�.");
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
				Human human = (Human)animal; //readbook ���̱� ����....
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

