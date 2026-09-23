package uml;

public class LaptopDemo {
    static void main() {
       // Laptop lap = new Laptop();
       // lap.setModel("vivobook");
//        Laptop.Processor cpu = lap.new Processor("Intel", 5.6);
//        cpu.displayInfo();

//        Laptop.Processor gpu = new Laptop.Processor("NVIDIA", 4);
        Laptop.Processor gpu = new Laptop.Processor("AMD", 5.2);
        gpu.displayInfo();

//        PCComponents.Memory mem = new PCComponents.Memory();
        PCComponents pc = new PCComponents();
        PCComponents.Memory mem = pc.new Memory();
        PCComponents.CPU cpu = new PCComponents.CPU();
    }

}
