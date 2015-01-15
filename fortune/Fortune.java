import java.util.Scanner;

class Fortune{
	int age;
	String  state;
 
void getAge(int a){
	
	age = a;
} 
void getState(String s){
	
	state = s;
}
void displayAge(){
	System.out.println("Member age is :"  + age );
}
void displayState(){
	System.out.println("Member state is:" +state);
	
}
public static void main(String args[]){
	
	Fortune n = new Fortune();
	Fortune s = new Fortune();

	System.out.format( "%55s" ,"*****FORTUNE TEAM MEMBERS: xD*****\n");
	System.out.format("%25s" ,"1.Mythi\n");
	System.out.format("%25s" ,"2.Vivek\n");
	System.out.format("%27s" ,"3.Harshit\n");
	System.out.format("%25s" ,"4.Karan\n");
	System.out.format("%27s" ,"5.Ishmeet\n");
	System.out.format("%28s" ,"6.Santhosh\n");
	System.out.format("%25s" ,"7.Tilak\n");
	System.out.format("%25s" ,"8.Rehan\n");
	
	int a;
	System.out.println("Enter the corresponding number to know about their status:");
	Scanner b = new Scanner(System.in);
	a=b.nextInt();
	switch( a){
		case 1:
		n.getAge(14);
	n.getState("Hacker and shitter");
	n.displayAge();
	n.displayState();
	break;
	case 2:
		n.getAge(21);
	n.getState("Noob ");
	n.displayAge();
	n.displayState();
	break;
	case 3:
		n.getAge(16);
	n.getState("Rom chodder");
	n.displayAge();
	n.displayState();
	break;
	case 4:
		n.getAge(18);
	n.getState("Kernel chodder");
	n.displayAge();
	n.displayState();
	break;
	case 5:
		n.getAge(18);
	n.getState("Hacker");
	n.displayAge();
	n.displayState();
	break;
	case 6:
		n.getAge(40);
	n.getState("Founder");
	n.displayAge();
	n.displayState();
	break;
	case 7:
		n.getAge(28);
	n.getState("Hacker and developer");
	n.displayAge();
	n.displayState();
	break;
	case 8:
		n.getAge(26);
	n.getState("Hacker and developer");
	n.displayAge();
	n.displayState();
	break;
	default:
	break;
		
		
	}
	
}
}
