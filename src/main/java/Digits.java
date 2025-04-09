import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    digitList = new ArrayList<Integer>();
	    String numbers = num + "";
	    for(int i = 0; i < numbers.length(); i ++){
		digitList.add(Integer.parseInt(numbers.substring(i,i+1)));
	    }
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
	   int count = 0; 
	   for(int i = 0; i < digitList.size()+-1;i++){
		if(digitList.get(i)<digitList.get(i+1)){
			count++;
		}
	   }return (count == digitList.size()-1);
	
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
