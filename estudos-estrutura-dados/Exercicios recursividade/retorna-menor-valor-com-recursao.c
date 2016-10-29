#include <stdio.h>

int menorValor(int vetor[], int n) {
	int atual = vetor[n-1];
	
	if (n == 1)
		return atual;
		
	int menor = menorValor(vetor, n-1);
	
	if (atual < menor) {
		return atual;	
	} else {
		return menor;
	}
}

int main(void)
{

	int *n;
	int i;
	int t;
	
	printf("Digite quantas casas seu vetor vai ter: ");
	scanf("%d", &t);
	n = &t;
	
	int vetor[*n];
	printf("Entre com os %d valores do vetor de inteiros: \n", *n);
	
	for (i = 0; i < *n; i++) 
	{
		scanf("%d", &vetor[i]);
	}
	
	printf("Menor valor do vetor: %d", menorValor(vetor, *n));
	
   	return 0;
}
