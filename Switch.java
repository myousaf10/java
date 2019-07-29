package july_29;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var = 'c';
		switch (var) {
		  case 'A':
		  case 'a':
		    System.out.println("Apple");
		    break;
		  case 'B':
		  case 'b':
		    System.out.println("Banana");
		    break;
		  case 'C':
		  case 'c':
		    System.out.println("Cherries");
		    break;
		  case 'D':
		  case 'd':
		    System.out.println("Dragon Fruit");
		    break;
		  case 'E':
		  case 'e':
		    System.out.println("Elder Berry");
		    break;
		  default:
			   System.out.println("Not in fruit basket ");
		}

	}

}
