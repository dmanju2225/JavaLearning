package arraysEasyProblems;

public class LeastDistanceForRepeated
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] ar = { 1,2,4,0,5,4};
		int[] result = LeastDist(ar);
		System.out.println(result[0]+" "+result[1]);

	}

	private static int[] LeastDist(int[] ar)
	{
		// TODO Auto-generated method stub
		int[] a = new int[2];
		int minDist = Integer.MAX_VALUE;
		int dist = 0;
		int element = 0;
		int temp = Integer.MAX_VALUE;
		int n = ar.length;
		int j = 0;
		int k = 0;
		while (k < n - 1)
		{
			j = k;
			for (int i = j; i < n; i++)
			{
				for (j = i + 1; j < n; j++)
				{
					if (ar[i] == ar[j])
					{
						dist = j - i;
						element = ar[j];
						if (dist == 1)
						{
							a[0] = dist;
							a[1] = element;
							return a;
						}
						if (temp<dist)
						{
							dist = temp;
						}
						temp = dist;
						break;
					}
				}
			}
			if (dist < minDist)
			{
				minDist = dist;
				System.out.println(minDist+" "+element);
				a[0] = minDist;
				a[1]=element;
			}
			k++;			
		}
		return a;
	}
}
