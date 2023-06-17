package solid;

import solid.isp.InternetPaymentService;
import solid.isp.TerminalPaymentService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Main {
    public static void main(String[] args) throws NotImplementedException {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payPhoneNumber(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
    }
}
