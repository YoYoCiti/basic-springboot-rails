package payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

  private @Id @GeneratedValue Long id;
  private String firstName;
  private String lastName;
  private String role;
  private String salary;
  private String address;

  Employee() {
  }

  Employee(String firstName, String lastName, String role, String salary, String address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.role = role;
    this.salary = salary;
    this.address = address;
  }

  public Long getId() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getRole() {
    return this.role;
  }

  public String getSalary() {
    return this.salary;
  }

  public String getAddress() {
    return this.address;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Employee))
      return false;
    Employee employee = (Employee) o;
    return this.firstName.equals(employee.firstName)
        && this.lastName.equals(employee.lastName)
        && this.role.equals(employee.role)
        && this.address.equals(employee.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.firstName, this.lastName, this.role, this.salary, this.address);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id
        + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName
        + '\'' + ", role='" + this.role + '\'' + ", salary='"
        + this.salary + '\'' + ", address='" + this.address + '\'' + '}';
  }
}