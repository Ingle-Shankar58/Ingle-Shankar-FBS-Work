package com.Employee;

import java.util.Objects;

public class Employee {

	int eid;
	String eName;
	double eSalary;

	public Employee(int eid, String eName, double eSalary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public Employee() {

	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return eSalary;
	}

	public void setSalary(double salary) {
		this.eSalary = salary;
	}

	@Override
	public String toString() {
		return String.format("| %-5d | %-15s | %-10.2f |", eid, eName, eSalary);
	}

	@Override
	public int hashCode() {
		return Objects.hash(eName, eid, eSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(eName, other.eName) && eid == other.eid
				&& Double.doubleToLongBits(eSalary) == Double.doubleToLongBits(other.eSalary);
	}

}
