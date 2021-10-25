class Duster{

private static  Duster duster=null;

public static Duster getduster(){
return duster;
}
static{
 duster=new Duster();
}

}


