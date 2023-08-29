import java.util.Scanner;
public class IsEqualToTest {
		public static <K> boolean isEqualTo (K a, K b) {
			if (a.equals(b) ){
				{
					System.out.println("They are equal");
					return true;
				}
			}
				else {
					System.out.println("They are not equal");
					return false;
				}
			}
			
			
	

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 2 integers");
		Integer a1 = new Integer(sc.nextInt());
		Integer a2 = new Integer(sc.nextInt());
		
		isEqualTo(a1, a2);
		
		System.out.println("Please enter 2 strings");
		String a3 = new String(sc.next());
		String a4 = new String(sc.next());
		
		isEqualTo(a3,a4);
		
		System.out.println("Please enter 2 doubles");
		Double a5 = new Double(sc.nextDouble());
		Double a6 = new Double(sc.nextDouble());
		
		isEqualTo(a5,a6);
		
		System.out.println("Two Objects");
		Object a7 = new Object();
		Object a8 = new Object();
		
		isEqualTo(a7,a8);
		
		
		
			
		}
 	
			
		}
		
		
		
		
	
	
	

