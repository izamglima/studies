#include <stdio.h>

void calculaN(int n) 
{
	int i;
	float resultado = 0.0;	
	
	for (i = 0; i < n; n--)
	{
		resultado += (( pow(n, 2) + 1) / (n + 3));
	}

	printf("\nResultado do n-esimo termo: %.2f", resultado);
}


int main() 
{
	int n;
	
	printf("Digite o valor n que deseja calcular: \n");
	scanf("%d", &n);
	
	calculaN(n);
	return 0;
}
