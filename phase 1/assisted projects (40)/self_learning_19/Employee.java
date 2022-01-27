package self_learning_19;

public class Employee {
	private static int id;
	private static String Name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}


	public static void main (String [] args){
		
	
		Employee emp1 = new Employee(85,"Riza");
		System.out.println(emp1.toString());
		System.out.println(emp1.hashCode());

	}
	@Override
	public String toString(){
		
	return "Employee ID : "+id+ " Employee Name :"+Name;
	  	   
   }
	@Override
	public int hashCode(){
		return id ;
	}
}


