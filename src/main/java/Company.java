
public class Company {
    private String companyName;
    private String companyDate;
    private String bulstat;

    public Company(String companyName, String companyDate, String bulstat){
        this.companyName = companyName;
        this.companyDate = companyDate;
        this.bulstat = bulstat;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDate() {
        return companyDate;
    }

    public void setCompanyDate(String companyDate) {
        this.companyDate = companyDate;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        checkBoundaryValue();
        this.bulstat = bulstat;
    }
    public boolean checkBoundaryValue(){
        if (getBulstat().length()==10){
            return true;
        }else{
            System.out.println("The boundary is out of scope");
            return false;

        }
    }


    }

