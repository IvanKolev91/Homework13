

public class Main {

    public static void main(String[] args) {
	CompanyET companyET = new CompanyET("Company","19-09-2020",
            "012345678910", "Comany", 8000, 6000 );
        System.out.println(companyET.toString());
        System.out.println(companyET.earnings());
    }

}
