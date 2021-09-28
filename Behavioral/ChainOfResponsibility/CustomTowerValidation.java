package com.tower;

interface Handler {
	public void setNext(Handler handler);
	public void handle(Tower t);
}


class BaseHandler implements Handler{

	Handler next;

	public void setNext(Handler handler){
		next = handler;
	}

	public void handle(Tower t){
		System.out.println("base handler");
		if(next != null){
			next.handle(t);
		}
	}

}

class CPUValidation extends BaseHandler{
	public void handle(Tower t){
		if(t.cpuCount() < 1){
			System.out.println("cpu at least 1");
		}else{
			super.handle(t);
		}
	}
}

class MemoryValidation extends BaseHandler{
	public void handle(Tower t){
		System.out.println("memory handler");
		super.handle(t);
	}
}

class SSDValidation extends BaseHandler{
	public void handle(Tower t){
		System.out.println("ssd handler");
		super.handle(t);
	}
}

public class CustomTowerValidation {

    public static void main(String[] args) {
        CPU cpu1 = new CPU();
	CPU cpu2 = new CPU();
	Memory m1 = new Memory();
	Tower tower = new Tower();
	tower.add(m1);
	CPUValidation cpuValidation = new CPUValidation();
	MemoryValidation memoryValidation = new MemoryValidation();
	SSDValidation ssdValidation = new SSDValidation();
	
	cpuValidation.setNext(memoryValidation);
	memoryValidation.setNext(ssdValidation);

	cpuValidation.handle(tower);
	
    }
}