package activities;

import java.util.*;

class Password{
	
	private int n;
	private int arr[];
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int arr[]) {
		this.arr = arr;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}



	public void get()
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		else
		{
			setArr(new int[n]);
			for(int i=0; i<n; i++)  
			{    
				getArr()[i]=sc.nextInt(); 
				if(getArr()[i]<0)
				{
					System.out.println("Invalid input");
					System.exit(0);
				}
			}
		}
		sc.close();
	}
	
	static int isprime(int a)
	{
		int flag=0;
		if(a==0 || a==1)
		{
			flag=1;
		}
		else if(a==2) {
			flag=0;
		}
		else
		{
			for(int i=2;i<=a/2;i++)
			{
				if(a%i==0)
				{
					flag=1;
					break;
				}
			}
		}

		return flag;
	}
	
	static int sumPrimeArray(int array[], int size)
	{
		int temp,sum=0;
		for(int i=0;i<size;i++)
		{
			temp=array[i];
			if(isprime(temp)==0)
			{
				sum=sum+temp;
			}
		}
		return sum;
	}
		
}


public class BankPassword {

	public static void main(String[] args) {
		
		Password p=new Password();
		p.get();
		int ans=Password.sumPrimeArray(p.getArr(), p.getN());
		System.out.println(ans);
		
		
	}

}
