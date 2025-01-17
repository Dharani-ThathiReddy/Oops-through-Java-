class Bank {
int number  , interest;
double balance ;
Bank ( int number , int interest , double balance) {
this.number = number ;
this.interest = interest;
this.balance = balance;
}
void deposit(double amount) {
balance +=amount;
}

}

class SavingsAccount extends Bank {
SavingsAccount ( int number , int interest , double balance){
super(number , interest , balance);
}
final double min_balance = 1000;
void withDraw( double amount) {
if(( balance-amount) > min_balance) {
 if ( amount < balance) {
    balance = balance - amount;
    }
 else  {
     System.out.println( "INSUFFICIENT FUNDS ");
     }
     }
else {
System.out.println("MIN EXCEEDED");
}    
}
}

class FixedDeposit extends SavingsAccount{
int rate;
FixedDeposit ( int number , int interest , double balance , int rate){
super(number , interest , balance);
this.rate = rate;
}
void getInterest() {
System.out.println( interest/100 * rate );
}
}

class Main {
public static void main (String args[] ){
Bank b = new Bank(1234567,4,2000);
b.deposit(4500);
SavingsAccount s = new SavingsAccount(123456,3,123456);
s.withDraw(1000);
FixedDeposit f = new FixedDeposit(1234567,5000,1234567,2);
f.getInterest();
}
}
 
     
   


