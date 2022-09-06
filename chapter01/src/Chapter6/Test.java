package Chapter6;

public class Test {
	public static void main(String[] args) {
		CPU cpu=new CPU();   
	    cpu.speed=2500;   
	    HardDisk disk=new HardDisk();  
	    disk.amount=2000;   
	    PC pc=new PC();  
	    pc.setCPU(cpu);  
	    pc.setHardDisk(disk);  
	    pc.show();  
	}
}
