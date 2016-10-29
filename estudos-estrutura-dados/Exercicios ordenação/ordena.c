#include <stdio.h>
#include <stdlib.h>

void buscaSequencial (int *vetor, int valor){
	int i;
	for(i = 0; i < 11; i ++) {
		if(vetor[i] == valor) {
			printf("Encontrado!\n");
			break;
		} else {
			printf("Nao encontrado!\n");
		}	
	}	
}

void buscaBinaria (int *vetor, int valor) {
	int i = 0, m, inicio = 0, fim = 10;
	
	if ((valor < vetor[0]) || (valor > vetor[9])) {
		printf("\nNao encontrado o valor ", valor);
		return;
	}
	
	do {
		m = inicio + fim / 2;
		if (vetor[m] == valor) {
			printf("\nEncontrado o valor ", valor, "na posicao ", m);
			i++;
		} else if (valor < vetor[m]){
			m--;
			m = m + fim/2;
		} else if(valor > vetor[m]) {
			inicio = m++;
			m = inicio + fim / 2;			
		}		
	} while(i ==0);	
}

void ordenaBubble(int *vetor, int tamanho){
	int i=0, j=1;
	//fazer uma varável receba o tamanho do vetor e que decremente a cada passada
	if(vetor[i] > vetor[j]) {
		
	}
}

int main(){ 

	int vetor[10] = {0,4,3,6,2,8,9,5,2,7};
	int busca = 6;
	//buscaSequencial(vetor, busca);
	
	int vetorOrdenado[10] = {0,1,2,3,4,5,6,7,8,9};
	int contem = 8;
	int Naocontem = 15;
	
	buscaBinaria(vetorOrdenado, contem);
	buscaBinaria(vetorOrdenado, Naocontem);
	
	int vetorDesordenado[10] = {9,7,6,3,1,0,2,4,8,0};
	printf("\n\n%d", vetorDesordenado);
	return 0;
}
