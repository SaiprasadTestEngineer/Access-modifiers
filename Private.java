package accessModifiers;

 class Am {
	//private  int i = 10;
	private  void m1(){
		//System.out.println(i);
	}
}
	
 public class Private {
	public static void main(String[] args) {
		Am am = new Am();
		//am.i=2000;   //compile time error bcz the variable and method private
		//am.m1(); //compile time error
		
	}

}
