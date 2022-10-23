import proxy.Account;
import proxy.BankService;
import proxy.BankWS;

public class ClientWS {
    public static void main(String[] args) {
        BankService stub = new BankWS().getBankServicePort();
        System.out.println(stub.convert(7600));
        Account cp = stub.getAccount(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getBalance());
    }
}
