
public class CompanyET extends Company {
    private String ownerName;
    private double initialFund;
    private double actualFund;

    public CompanyET(String companyName, String companyDate, String bulstat, String ownerName, double initialFund, double actualFund) {
        super(companyName, companyDate, bulstat);
        this.ownerName = ownerName;
        this.initialFund = initialFund;
        this.actualFund = actualFund;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getInitialFund() {
        return initialFund;
    }

    public void setInitialFund(double initialFund) {
        this.initialFund = initialFund;
    }

    public double getActualFund() {
        return actualFund;
    }

    public void setActualFund(double actualFund) {
        this.actualFund = actualFund;
    }
    public Double earnings(){
        double earnings = getActualFund()-getInitialFund();
        return earnings;

    }
    @Override
    public String toString() {
        return "The name of the company is: " + getCompanyName() + "\nThe company is established on: " + getCompanyDate() +
                "\nThe bulstat of the company is: " + getBulstat() + "\nThe owner of the comapny is: " + getOwnerName() +
                "\nThe initial fund of the company is " + getInitialFund() + "\nThe actual fund of the company is: " + getActualFund();
    }
}
