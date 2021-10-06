class BarodaBank extends Bank{
@Override
public void provideLoans(double roi){
System.out.println("Loan Provide by BarodaBank");
System.out.println(roi);
}
}