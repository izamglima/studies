#include <stdio.h>

float calculaRec(int n)
{
	float resultado = 0.0; 
	
	if (n == 0) 
	{
		return 0;
	} else {
		resultado += ((pow(n, 2) + 1) / (n + 3)) + calculaRec(n-1);
	}	
	return resultado;
}

int main() 
{
	int n;
	
	printf("Digite o valor n que deseja calcular: \n");
	scanf("%d", &n);
	
	printf("\n Resultado do calculo: %.2f", calculaRec(n));
	return 0;
}
