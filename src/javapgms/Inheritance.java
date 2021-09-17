package javapgms;

  class inherit {
	
	public   void A(int a) {
		//int a;
		System.out.println("value is "+a);
		
		
	}
 }
	 class Inherit2 extends inherit {
		
		public void B(int a , int b) {
			System.out.println("values are " +a+ "and" +b);
		}
	}
	class Inheritance {
		
	public static void main(String[] args) {
     Inherit2 i = new Inherit2();
 i.A(10);
 i.B(20, 30);
	}
	}

		
	

