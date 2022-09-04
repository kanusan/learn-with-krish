import java.io.*;

class Employee {
	int id, code;
	String nic, name, address;
	
	Employee(int id,int code, String nic, String name, String address){
		this.id = id;
		this.code = code;
		this.nic = nic;
		this.name = name;
		this.address = address;
	}
	
	public int getId(){
	 return id;
	}
	
	public void setId(int id){
	 this.id = id;
	}
	
	public int getCode(){
	 return code;
	}
	
	public void setCode(int code){
	 this.code = code;
	}
	
	void display(){
	System.out.println(id+" "+code+" "+nic+" "+name+" "+address);
	}
	
		@Override
		public boolean equals(Object obj)
		{
		
			if(obj == null){
				return false;
			}
			
			if(obj == this) 
				return true;
			
				return this.getId() == ((Employee) obj).getId() && 
					   this.getCode() == ((Employee) obj).getCode();
			
		}
	
}

class EqualImplementation {
	
	public static void main(String args[]){
		
		Employee e1 = new Employee(11,101,"112345","Peter","Colombo");
		Employee e2 = new Employee(11,101,"112345","Peter","Colombo");
		Employee e3 = new Employee(22,202,"223456","John","Kandy");
		
		e1.display();
		e2.display();
		e3.display();
		
		System.out.println("Comparing employee e1 and e2"+" : "+ e1.equals(e2));
		System.out.println("Comparing employee e1 and e3"+" : "+ e1.equals(e3));
		
		
	
	}
}
