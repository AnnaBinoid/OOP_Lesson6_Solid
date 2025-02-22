package solid;

import solid.lsp.FactoryOrder;
import solid.lsp.Order;
import solid.lsp.OrderAbstract;
import solid.lsp.OrderBonus;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, true));
        calculator.add(creator.create(1, 3, false));

        for (OrderAbstract order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}
