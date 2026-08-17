import org.testng.annotations.Test;

public class DebitCard {

    @Test (groups = {"smoke"})
    public void debitCardStatement(){
        System.out.println("debitCardStatement");
    }

    @Test (groups = {"critical"})
    public void debitCardPayment(){
        System.out.println("debitCardPayment");
    }

    @Test
    public void debitCardDue(){
        System.out.println("debitCardDue");
    }
}
