import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NetBanking {

    @Test (groups = {"smoke"})
    @Parameters({"executorName"})
    public void netBankingStatement(String name){
        System.out.println("creditCardStatement");
        System.out.println("Executed by : " + name);
    }

    @Test (groups = {"critical"})
    public void netBankingPayment(){
        System.out.println("netBankingPayment");
    }

    @Test
    public void netBankingCardDue(){
        System.out.println("netBankingDue");
    }
}
