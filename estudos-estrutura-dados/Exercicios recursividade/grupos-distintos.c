#include <stdio.h>

int Comb(int n, int k) {
	
	if (k == 1 ) 
	{
		return n;
	}
	else if (n == k || k == 0) 
	{
		return 1;
	}
	else if (1 < k < n) {
		return Comb(n - 1, k - 1) + Comb(n - 1, k);
	}
}

int main(void)
{
	printf("Numero de grupos distintos: %d", Comb(10, 5));
	
	return 0;
}
