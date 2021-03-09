import java.util.Scanner;
public class trials {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the Sample Size: ");
		int samSize = input.nextInt();
		int trialSize = 4;
		
		int[] data = new int[samSize * trialSize];
		int[] total = new int[trialSize];
		int[] average = new int [trialSize];
		
		int i = 0;
		int j = 0;

		for (i=0;i <trialSize;i++)
		{
			System.out.println("Enter number for Trial: " + i);
			for (j=0;j<samSize;j++)
			{
			System.out.print("Enter Sample # " + j + ": ");
			data[j* trialSize + i] = input.nextInt();
			total[i] += data[j* trialSize + i];
		}
			
	}
	for (i=0; i<trialSize; i++)
		average[i] = total[i] / samSize;
	
	int min = average[0];
	int max = average[0];
	
	for (i=0; i<trialSize; i++)
	{
		if (average[i]< min)
			min = average[i];
		if (average[i]> max)
			max = average[i];
	}
	
	System.out.println("Sample #  Trial 1   Trial 2   Trial 3   Trial 4"); // Table header line
	
	for (j=0; j < samSize; j++)
	{
		System.out.print("\t"+ j+ "\t" );
		for (i=0; i < trialSize; i++)
		{
		System.out.print( + data[j* trialSize + i] + "\t");
		
	}
		System.out.print("\n");
}
	System.out.println("---------------------------------------------------------------------");
	System.out.print("Average \t");
	
	for (i=0; i<trialSize; i++)
		System.out.print(average[i] + "\t");
	System.out.print("\n");
	System.out.println("Min average " + ": " + min);
	System.out.println("Max average " + ": " + max);
	System.out.println("\n");
	
	if (min == max) 
		System.out.println("The trials match EXACTLY!");
	else if (max<min*2)
	System.out.println("The trials concur with each other!");
		else 
			System.out.println("The trials do not concur!");

	}
	
	
}