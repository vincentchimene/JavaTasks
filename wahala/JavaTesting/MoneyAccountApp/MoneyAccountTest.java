import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoneyAccountTest{
	MoneyAccount myAccount;
    @BeforeEach
        void setup(){
            myAccount = new MoneyAccount();
        }
      
     @Test
     public void testThatIHaveAnAccountICheckBalanceAndBalanceIsZero(){
     	assertNotNull(myAccount);
     	
     	int expectedBalance = 0;
     	int actualBalance = myAccount.getBalance();
     	assertEquals(expectedBalance, actualBalance);
		     
     }
     
     @Test
     public void testThatIDeposit2000AndItReflectsInMyAccountBalance(){
        myAccount.deposit(2000);
        int expectedBalance = 2000;
        int actualBalance = myAccount.getBalance();
        assertEquals(expectedBalance, actualBalance);  
        
        myAccount.deposit(5000);
        expectedBalance = 7000;
        actualBalance = myAccount.getBalance();
        assertEquals(expectedBalance, actualBalance);  
         
     }
     
     @Test
     public void testThatIdepositedANegativeValueAndItThrowsAnException(){
        myAccount.deposit(3000);
        
        assertThrows(IllegalArgumentException.class, ()-> myAccount.deposit(-5000));
        assertEquals(3000, myAccount.getBalance());
        
     }
     
     
     		
        
   




}
