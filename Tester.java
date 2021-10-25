class Tester{

private static  Tester tester=null;

public static Tester gettester(){
return tester;
}
static{
 tester=new Tester();
}

}


