package epam.assignment5.collection;
import java.util.*;
public class List {
    public static void main( String[] args ){
    	Scanner s=new Scanner(System.in);
    	Collection<String> list0=new Collection<String>();
    	while(true){
    		System.out.println("Opt the options from below\n1.Show the list\n2.Add elements to list\n3.Delete element at a particular position from list\n4.Fetch data at position in the list\n5.Size of the list\n6.break");
			int n=s.nextInt();
			if(n==6){
				System.out.println("Successfully terminated");
				break;
			}
			switch(n){
				case 1:
					int l=list0.weight();
					System.out.print("elements of the list are : ");
					for(int i=0;i<l;i++){
						String str=(String)list0.get(i);
						System.out.print(str+" ");
					}
					System.out.println();
					break;
				case 2:
					System.out.print("Give the no of elements to be added : ");
					String p=s.next();
					list0.sum(p);
					break;
				case 3:
					System.out.print("Give the index of the element to be deleted : ");
					int position=s.nextInt();
					int result=list0.delete(position-1);
					if(result==1)
						System.out.println("Element was deleted");
					else
						System.out.println("Element was not deleted");
					break;
				case 4:
					System.out.print("Give the position of the element to be retrieved : ");
					int k=s.nextInt();
					k-=1;
					if(k>=list0.weight() || k<0)
						System.out.println("Enter Correct index");
					else
						System.out.println("Element at the index "+k+" is "+list0.get(k));
					break;
				case 5:
					System.out.println("List size is : "+list0.weight());
					break;
				default:
					System.out.println("Please Enter a valid option");
					break;
			}}
    	s.close();
    }}