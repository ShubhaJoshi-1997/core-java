class LaptopsTester{

public static void main(String a[]){
Lenovo lenovo = new Lenovo();
lenovo.price = 35000.00;
lenovo.processor = "Intel";
lenovo.storage = "500GB";
lenovo.modelNo = "qwert18";
String store = lenovo.store();
System.out.println(store);
lenovo.displayDetails();
}
}