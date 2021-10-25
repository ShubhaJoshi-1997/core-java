class CameraTester{
public static void main(String a[]){

Camera camera = new Camera();
camera.setCameraId(1411);
camera.setCameraName("Canon");
camera.setCameraPrice(25000);

Lense lense = new Lense();
lense.lenseType ="Concave";
lense.lenseColor ="White";

camera.setLenses(lense);
System.out.println(camera);
}
}