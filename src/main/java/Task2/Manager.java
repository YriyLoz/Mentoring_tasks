package Task2;

public class Manager extends Employee {
    private int quantity;

    public Manager(String name, int salary, int clientAmount) {
        super(name, salary);
        this.quantity = clientAmount;
    }

    @Override
    public void setBonus(int bonus) {
        if (quantity > 150) {
            super.setBonus(bonus + 1000);
        } else if (quantity > 100) {
            super.setBonus(bonus + 500);
        }
    }
}
