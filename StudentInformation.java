public class EmployeeInformation {

    public static void main(String[] args) {
        printEmployeeInfo();
    }

    private static void printEmployeeInfo() {
        String companyName = "Happy Home";
        String employeeName = "Harishchender";
        int empId = 2010;

        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Emp Id: " + empId);

        System.out.println("\nWelcome, " + employeeName + "!");
        System.out.println("We hope you have a fantastic journey at " + companyName + ".");  
        System.out.println("Learn Here and Lead anywhere!!!!!!!!!");
        System.out.println("!!!!!!!THANK YOU!!!!!!!!!");
    }
}

