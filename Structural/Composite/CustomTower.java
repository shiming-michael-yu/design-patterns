import java.util.ArrayList;

interface Component {
	public double price();
	public double weight();
}


class Monitor implements Component{
	public double price(){
		return 1000.0;
	}

	public double weight(){
		return 5.0;
	}

}

class Keyboard implements Component{
	public double price(){
		return 50;
	}

	public double weight(){
		return 1;
	}

}

class Mouse implements Component{
	public double price(){
		return 30;
	}

	public double weight(){
		return 0.2;
	}

}

class CPU implements Component{
	public double price(){
		return 2000;
	}

	public double weight(){
		return 0.3;
	}

}

class Memory implements Component{
	public double price(){
		return 180;
	}

	public double weight(){
		return 0.1;
	}

}

class SSD implements Component{
	public double price(){
		return 500;
	}

	public double weight(){
		return 0.5;
	}

}

class Power implements Component{
	public double price(){
		return 150;
	}

	public double weight(){
		return 5;
	}

}


class MotherBoard implements Component{
	public double price(){
		return 1800;
	}

	public double weight(){
		return 2;
	}

}

class Case implements Component{
	public double price(){
		return 130;
	}

	public double weight(){
		return 4;
	}

}

class Tower implements Component{
	private ArrayList includedComponents = new ArrayList();

	void add(Object obj){
		includedComponents.add(obj);
	}

	public double price(){
		double total = 0;
		for(Object o : includedComponents){
			Component obj = (Component) o;
			total = total + obj.price();
		}
		return total;
	}

	public double weight(){
		double total = 0;
		for(Object o : includedComponents){
			Component obj = (Component) o;
			total = total + obj.weight();
		}
		return total;
	}

}

public class CustomTower {

    public static void main(String[] args) {
        CPU cpu1 = new CPU();
	CPU cpu2 = new CPU();
	Memory m1 = new Memory();
	Tower tower = new Tower();
	tower.add(cpu1);
	tower.add(cpu2);
	tower.add(m1);
	System.out.println("price: "+tower.price());
	System.out.println("weight: "+tower.weight());
	
    }
}