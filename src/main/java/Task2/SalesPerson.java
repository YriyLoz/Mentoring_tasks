package Task2;

public class SalesPerson extends Employee {
    private int percent;

    public SalesPerson(String lastName, int salary, int percent) {
        super(lastName, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(int bonus) {
        if (percent > 200) {
            super.setBonus(bonus * 3);
        } else if (percent > 100) {
            super.setBonus(bonus * 2);
        }
    }
}
