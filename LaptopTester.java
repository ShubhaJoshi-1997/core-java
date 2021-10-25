class LaptopTester{
public static void main(String a[]){

Laptop laptop = new Laptop();
laptop.setLaptopId(1234);
laptop.setLaptopName("Lenovo");
laptop.setLaptopPrice(38000);

Harddisk harddisk = new Harddisk();
harddisk.harddiskType ="Pendrive";
harddisk.harddiskSize ="64 gb";

laptop.setHarddisks(harddisk);
System.out.println(laptop);
}
}