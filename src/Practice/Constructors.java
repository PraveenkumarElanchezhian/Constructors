package Practice;

public class Constructors {
			/*
			 Special method
			 Construct object
			*/
           String customer_name;
           int age;
           double Balance_amount;
           
           //default constructor
           //compiler to write the constructor
           Constructors(){
        	   
           }
           
           //Class name should be same as Constructor name
           //Parameterized constructor
           
	   Constructors(String customer_name,int age,double Balance_amount) {
		   this.customer_name = customer_name;
		   this.age = age;
		   this.Balance_amount = Balance_amount;
	   System.out.println("Customer details");
   }
	   
		   public static void main(String[] args) {
			    Constructors rv1 = new Constructors("Praveen",23,550.10); //used along with new keyword
			    rv1.display();
			    Constructors rv2 = new Constructors("kumar",25,999.98);
			    rv2.display();
			    Constructors rv3 = new Constructors("Ram",26,1500.08);
			    rv3.display();
		   }
		   
		   //Method overloading : Whenever the purpose the same
		   // It differentiate based upon the parameter =>(number,data type,order)
		   
		   void display() {
			   System.out.println(customer_name);
			   System.out.println(age);
			   System.out.println(Balance_amount);
          }
		   
}
