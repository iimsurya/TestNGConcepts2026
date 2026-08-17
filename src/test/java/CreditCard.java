import org.testng.annotations.Test;

public class CreditCard {

    @Test (groups = {"smoke"})
    public void creditCardStatement(){
        System.out.println("creditCardStatement");
    }
    
    @Test (groups = {"critical"})
    public void creditCardPayment(){
        System.out.println("creditCardPayment");
    }
    
    @Test
    public void creditCardDue(){
        System.out.println("creditCardDue");
    }
}
