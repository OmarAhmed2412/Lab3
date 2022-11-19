public class Institution {
    private String name;
    private int employees;
    private double savings;

    public Institution(String name, int employees, double savings) {
        this.name = name;
        this.employees = employees;
        this.savings = savings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }
    public double getNetSaving(){
        double GNS;
        GNS = this.savings - (this.savings * 7/100);
        return GNS;
    }
    public void printData(){
        System.out.print(this.name+","+this.employees+","+this.savings);
    }
}
