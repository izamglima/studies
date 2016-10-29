#include <stdio.h>

int menorValor(int vet[], int n) {
	int i = 0 ;
	int menor = vet[i];
	
	for(i = 0; i < n; i++) {
		if ( menor > vet[i] ) {
			menor = vet[i];
		}
	}
	return menor;
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
 

