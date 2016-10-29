#include <stdio.h>

void calculaIMC();

int main()
{
	calculaIMC();
	return 0;
}

void calculaIMC()
{
	float altura = 0, peso = 0, imc = 0;
	printf("\nEscreva sua altura: ");
	scanf("%f", &altura);
	printf("\nEscreva seu peso: ");
	scanf("%f", &peso);
	imc = peso / pow(altura, 2);
	printf("Calculo apenas %f\n", imc);
	if (imc > 18.5 && imc < 25) {
		printf("Seu imc esta normal!");
	} else if (imc > 25 && imc < 30 ) {
		printf("Seu imc esta com sobrepeso...");
	} else if(imc > 30){
		printf("Seu imc esta obeso :( ");
	}
}