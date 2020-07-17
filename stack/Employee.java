package stack;

import java.util.Objects;

public class Employee {
    String firstName;
    int id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String firstName, int id) {
        this.firstName = firstName;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() &&
                getFirstName().equals(employee.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }


}
