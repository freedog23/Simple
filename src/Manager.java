public class Manager extends Employee {
    private double bonus;

    Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) { this.bonus = bonus; }
    public double getBonus() { return bonus; }
    @Override
    public double getSalary() { return bonus + getSalary(); }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;

        Manager other = (Manager)otherObject;

        return bonus == other.bonus;
    }

    /*@Override
    public int hashCode() {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }*/
}
