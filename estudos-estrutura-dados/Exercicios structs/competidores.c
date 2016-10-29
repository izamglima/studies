#include <stdio.h>
#include <stdlib.h>

#define N 3 //alterar aqui o valor

struct competidores 
{
	int numero;
	float primeiro_salto;
	float segundo_salto;
} dados[N];


void ler_competidores_calcula() 
{
	int i;
	for(i = 0 ; i < N; i++ ) 
	{
		
		printf("\nDigite o numero do competidor: ");
		scanf("%i", &dados[i].numero);
			
		printf("\nDigite a altura em cm do primeiro salto: ");
		scanf("%f", &dados[i].primeiro_salto);
			
		printf("\nDigite a altura em cm do segundo salto: ");
		scanf("%f", &dados[i].segundo_salto);	
	}
	
	system("cls");
	
	float maior = 0;
	int k = 0;
	for (i = 0 ; i < N; i++)
	{
		if(dados[i].primeiro_salto > maior ) {
			maior = dados[i].primeiro_salto;
			k = dados[i].numero;
		}
		if (dados[i].segundo_salto > maior ) {
			maior = dados[i].segundo_salto;
			k = dados[i].numero;
		}
	}
	printf("\nMaior salto: %.2f e competidor: %d ", maior, k);
}

int main() 
{
	ler_competidores_calcula();
	return 0;
}
