class  Camera{

public int cameraId;
public String cameraName;
public int cameraPrice;
public Lense lenses;


public Camera (){
	System.out.println(this.getClass().getSimpleName() +"Objects are created");
}

public void setCameraId(int cameraId){
	this.cameraId = cameraId;
}

public void setCameraName(String CameraName){
	this.cameraName = cameraName;
}
public void setCameraPrice(int cameraPrice){
	this.cameraPrice = cameraPrice;
}
public void setLenses(Lense lenses){
	this.lenses = lenses;
}
@Override
public String toString(){
	return "Camera - [CameraId = "+this.cameraId+" , CameraName= "+this.cameraName+" , CameraPrice= "+this.cameraPrice+" Lense ="+this.lenses+"]";
}
}