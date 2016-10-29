#include <stdio.h>

int main()
{
	int num[10], i, num_Maior,c, k,j, num_Menor;
	
	printf("Entre com dez numeros: \n");
	
	for(i = 0; i <= 9; i++){
		scanf("%d", &num[i]);
	}
	
	num_Maior = 0;
	for(c = 0; c <= 9; c++){
		if(num_Maior < num[c]){
			num_Maior = num[c];
		}
	}
	printf("\nO maior valor inserido eh de: %d\n", num_Maior);
	
	num_Menor = 9999;
	for(j = 0; j <= 9; j++){
		if(num_Menor > num[j]){
			num_Menor = num[j];
		}
	}
	printf("\nO menor valor inserido eh de: %d\n", num_Menor);
	
	for(k = 0; k <= 9; k++ ){
		printf("A posicao %d do vetor tem o valor de: %d \n", k, num[k]);
	}
	
}