class Fan{

private static  Fan fan=null;

public static Fan getFan(){
return fan;
}
static{
 fan=new Fan();
}

}


