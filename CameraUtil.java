class CameraUtil{

public static void main(String a[]){
Camera camera = new Camera();
camera.company="Sony";
camera.price=28000;
camera.type="DSLR";

System.out.println(camera.company +" "+camera.price +" "+ camera.type);
camera.picture();

Camera camera1 = new Camera();
camera1.company="Canon";
camera1.price=25000;
camera1.type="Digital";

System.out.println(camera1.company +" "+camera1.price +" "+ camera1.type);
camera1.picture();
}
}