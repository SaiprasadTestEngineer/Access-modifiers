package accessModifiers;

class Deff {
	int iii = 1001;
	 void m2() {
		 System.out.println(iii);
}
}
    public class DefaultAccM {
	  public static void main(String[] args) {
		  Deff deffn = new Deff();
			deffn.iii=101;
			deffn.m2();
	}
	

   }

