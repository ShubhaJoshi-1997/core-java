class Ncr{

public static void main(String a[]){
int nCr=fact(4)/(fact(2)*fact(4-2));
System.out.println(nCr);
}


public static int fact(int n){
System.out.println("fact method started");
int fact=1;
for (int i=1;i<=n;i++){
fact=fact*i;

}

System.out.println("fact method ended");


return fact;
}

}