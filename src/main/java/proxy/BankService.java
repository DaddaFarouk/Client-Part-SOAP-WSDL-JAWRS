
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BankService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @param amount
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Convert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Convert", targetNamespace = "http://ws/", className = "proxy.Convert")
    @ResponseWrapper(localName = "ConvertResponse", targetNamespace = "http://ws/", className = "proxy.ConvertResponse")
    @Action(input = "http://ws/BankService/ConvertRequest", output = "http://ws/BankService/ConvertResponse")
    public double convert(
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Account>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listAccounts", targetNamespace = "http://ws/", className = "proxy.ListAccounts")
    @ResponseWrapper(localName = "listAccountsResponse", targetNamespace = "http://ws/", className = "proxy.ListAccountsResponse")
    @Action(input = "http://ws/BankService/listAccountsRequest", output = "http://ws/BankService/listAccountsResponse")
    public List<Account> listAccounts();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Account
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccount", targetNamespace = "http://ws/", className = "proxy.GetAccount")
    @ResponseWrapper(localName = "getAccountResponse", targetNamespace = "http://ws/", className = "proxy.GetAccountResponse")
    @Action(input = "http://ws/BankService/getAccountRequest", output = "http://ws/BankService/getAccountResponse")
    public Account getAccount(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
