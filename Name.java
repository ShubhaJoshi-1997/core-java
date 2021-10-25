class Name{

private static  Name name=null;

public static Name getname(){
return name;
}
static{
 name=new Name();
}

}


