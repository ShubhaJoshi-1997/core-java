class Factorial{

public static void main(String a[]){
System.out.println("main method started");
calculateFactorial(4);

System.out.println("main method ended");
}

public static void calculateFactorial(int n){
System.out.println("calculateFactorial method started");
int fact=1;
for (int i=1;i<=n;i++){
 fact=fact*i;
}
System.out.print(fact);
System.out.println("calculateFactorial method ended");
}
}