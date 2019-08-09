package org.tcs.test;

public interface client{
	void name();
	void location();
	
	public interface employee{
		void empname();
		void empId();	
	}
	
	public class Company implements client, employee {

		@Override
		public void empname() {
			System.out.println("Anusha");
		}

		@Override
		public void empId() {
			System.out.println(722391);
		}

		@Override
		public void name() {
			System.out.println("Nielsen");
		}

		@Override
		public void location() {
			System.out.println("USA");
		}
		
	}
	
	public static void main(String[] args) {
		Company c = new Company();
		c.empname();
		c.empId();
		c.name();
		c.location();
	}
}
