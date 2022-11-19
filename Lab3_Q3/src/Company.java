public class Company extends Institution {
    private double taxPercent;


    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        if(taxPercent >= 5 && taxPercent <= 10)
            this.taxPercent = taxPercent;
        else
            this.taxPercent = 7;
    }

    public Company(String name, int employees, double savings, double taxPercent) {
        super(name, employees, savings);
        if(taxPercent >= 5 && taxPercent <= 10)
            this.taxPercent = taxPercent;
        else
            this.taxPercent = 7;
    }

    @Override
    public double getNetSaving() {
        return this.getSavings() - (this.getSavings() * (this.taxPercent/100));
    }
    public void addEmployee(){
        this.setEmployees(getEmployees() + 1);
    }

    @Override
    public void printData() {
        super.printData();
        System.out.print(","+this.taxPercent);

    }

}
