
public class Company {
    private String companyName;
    private String companyDate;
    private String bulstat;

    public Company(String companyName, String companyDate, String bulstat) {
        this.companyName = companyName;
        this.companyDate = companyDate;
        this.bulstat = bulstat;
    }

    String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    String getCompanyDate() {
        return companyDate;
    }

    public void setCompanyDate(String companyDate) {
        this.companyDate = companyDate;
    }

    String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length() == 10) {
            this.bulstat = bulstat;
        } else {
            System.out.println("The boundary is out of scope");
        }
    }
}

