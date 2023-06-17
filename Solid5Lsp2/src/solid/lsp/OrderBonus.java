package solid.lsp;

public class OrderBonus extends OrderAbstract{

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Бонус: %s", super.toString());
    }
}
