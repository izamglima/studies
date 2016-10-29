#include <stdio.h>
main()
{
	int matrix[2][3], matrix2[2][3], matrix3[2][3], i, j, k, l, m, n, o, p;
	printf("Escreva numeros inteiros para primeira matriz: \n");
	//le a primeira matriz
	for(i = 1; i <= 2 ; i++ ){
		for(j = 1 ; j <= 3; j++ ){
			scanf("%d", &matrix[i][j]);
		}
	}
	printf("Escreva numeros inteiros para segunda matriz: \n");
	// le a segunda matriz
	for(k = 1; k <= 2 ; k++ ){
		for(l = 1 ; l <= 3; l++ ){
			scanf("%d", &matrix2[k][l]);
		}
	}
	
	//soma as duas matrizes
	for(o = 1; o <= 2; o++){
		for(p = 1; p <= 3; p++){
			matrix3[o][p] = matrix[o][p] + matrix2[o][p];
		}
	}
	
	//printa a soma
	printf("\nmatriz = ");
	for(m = 1; m <= 2 ; m ++ ){
		if(m > 1) //na segunda linha da matriz, quebra uma linha e tabula;
		printf("\n\t ");
		for(n = 1 ; n <= 3; n++ ){
			printf("%d ", matrix3[m][n]);
			
		}
		printf("\n");
	}
}