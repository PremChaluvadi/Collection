package epam.assignment5.collection;
import java.util.Arrays;
public class Collection<T>{
	public Object arr[]=new Object[10];
	public int l=0;
	public int n=10;
	public Collection(){
		for(int i=0;i<10;i++)
			arr[l++]=String.valueOf(i+1);
	}
	public void sum(T x){
		if(l>=n)
		{
			Allocate();
		}
		arr[l++]=String.valueOf(x);
	}
	private void Allocate(){
	       int sizenew = (arr.length*3)/2+1;
	       n=sizenew;
	       arr = Arrays.copyOf(arr,sizenew);
	}
	public Object get(int i) {
		if(i>=0&&i<l)
			return arr[i];
		return null;
	}
	public int delete(int i){
		if(i>=0&&i<l){
			int rem =l-(i+1);
		    System.arraycopy(arr,i+1,arr,i,rem);
		    l-=1;
		    return 1;
		}		
		return 0;
	}
	public int weight() 
	{
		return l;
	}
}