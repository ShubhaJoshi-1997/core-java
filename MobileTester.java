class MobileTester{
public static void main(String a[]){

Mobile mobile = new Mobile();
mobile.setMobileId(0314);
mobile.setMobileName("Redmi");
mobile.setMobilePrice(23000);

Sim sim = new Sim();
sim.simName ="Airtel";
sim.simNetworkType ="4G";

mobile.setSims(sim);
System.out.println(mobile);
}
}