public class Main {
    public static void main(String[] args) {
        Institution omar = new Institution("omar",200,300);
        Company yousry = new Company("yousry",300,1990,10);
        //double n = 5.5;
        omar.printData();
        System.out.println();
        yousry.printData();
        //System.out.println();
        //System.out.println(omar.getNetSaving());
        //System.out.println(yousry.getEmployees());
        //yousry.addEmployee();
        //System.out.println(yousry.getEmployees());
        System.out.println();
        System.out.println(yousry.getNetSaving());

    }
}