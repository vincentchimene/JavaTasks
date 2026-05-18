public class MoneyAccount{

    int balance;
    
    public int getBalance(){
        return balance;
    }
    
    public void deposit(int amountToDeposit){
        if(amountToDeposit < 0){
            throw new IllegalArgumentException("Amount cannot be negative!");
        }
        balance += amountToDeposit;
    }
    
    public void withdraw(int amountToWithdraw){
        if(amountToWithdraw < 0){
        throw new IllegalArgumentException("Amount cannot be negative!");
        }
        if(amountToWithdraw > balance){
        throw new IllegalArgumentException("Amount cannot be greater than balance!");
        }
        balance -= amountToWithdraw;
    }
    
    public void transfer(int amountToTransfer, MoneyAccount anotherAccount){
        withdraw(amountToTransfer);
        anotherAccount.deposit(amountToTransfer);   
    }
    
     public void transfer(MoneyAccount anotherAccount, int amountToTransfer){
        withdraw(amountToTransfer);
        anotherAccount.deposit(amountToTransfer);   
    }
    



}



// javac -cp "junit.jar:out" -d out MoneyAccountTest.java MoneyAccount.java
// javac -cp "junit.jar" *.java


// java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

// java -cp "junit.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
