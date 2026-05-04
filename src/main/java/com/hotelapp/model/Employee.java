	package com.hotelapp.model;

	public class Employee {
		private int employeeId;
		private String name;
		private String role;

		public Employee(int employeeId, String name, String role) {
			this.employeeId = employeeId;
			this.name = name;
			this.role = role;
		}

		public void displayEmployeeInfo() {
			System.out.println("Employee ID: " + employeeId);
			System.out.println("Name: " + name);
			System.out.println("Role: " + role);
		}

		public void assignRole(String role) {
			this.role = role;
		}
	}