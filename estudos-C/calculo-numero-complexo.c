#include <stdio.h>
#include <math.h>

void calculaComplexo();

int main()
{
	calculaComplexo();
	
	return 0;
}

void calculaComplexo()
{
	//calculo do z
	float a = 0, b = 0, z = 0, alfa = 0, y = 0;
	printf("Escreva dois numeros: ");
	scanf("%f %f", &a, &b);
	z = sqrt((pow(a, 2) + pow(b, 2)));
	printf("\nO valor do numero complexo eh de: %f \n", z);
	
	//calculo do angulo alfa
	alfa = b/a;
	alfa = atan(alfa);
	y = (360 * alfa) / (2 * M_PI);
	printf("O valor de: %f", y);
	
}