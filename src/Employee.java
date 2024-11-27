import java.util.Objects;
public class Employee {
    private String firstName;
    private String lastName;
    private String title;
    private double payRate;


    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;

    }

    public double calculateWeeklySalary() {
        return payRate * 40;

    }

    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public double getPayRate() {
        return payRate;

    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastname='" + lastName + '\'' +
                ", firstname='" + firstName + '\'' +
                ", title='" + title + '\'' +
                ", payRate=" + payRate +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;

        return Double.compare(payRate,employee.payRate) == 0 && Objects.equals(firstName,employee.firstName)&&Objects.equals(lastName,employee.lastName) && Objects.equals(title,employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,title,payRate);
    }
}


