import org.testng.annotations.Test;

public class FundTransfer {

    @Test (groups = {"smoke"})
    public void fundTransferStatement(){
        System.out.println("fundTransferStatement");
    }

    @Test (groups = {"critical"})
    public void fundTransferPayment(){
        System.out.println("fundTransferPayment");
    }

    @Test
    public void fundTransferCardDue(){
        System.out.println("fundTransferDue");
    }
}
