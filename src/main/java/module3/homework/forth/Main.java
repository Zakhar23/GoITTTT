package module3.homework.forth;

public class Main {
    public static void main(String[] args) {
        User newUser = new User("Petro", 1000, 2, "BODO", 500, "USD");

        newUser.paySalary(150);
        newUser.withdraw(10);
        System.out.println(newUser.companyNameLenght());
        newUser.monthIncreaser(7);
    }
}
