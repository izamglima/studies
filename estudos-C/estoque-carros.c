#include <stdio.h>
#include <locale.h>

void fillData();

int main()
{
	fillData();
	return 0;
}

void fillData()
{
	struct estoque {
		char marca[20];
		char modelo[20];
		int ano;
		float combustivel;
		float motorizacao;
		float valor;
	} carros[3];
	int i;
	printf("Escreva os dados do carro.\n");
	
	for(i = 0; i < 3; i++)
	{
		printf("\nMarca: ");
		scanf("%s", &carros[i].marca);
		printf("\nModelo: ");
		scanf("%s", &carros[i].modelo);
		printf("\nAno: ");
		scanf("%i", &carros[i].ano);
		printf("\nCombustível: (obs - usar virgula )", setlocale(LC_ALL, ""));
		scanf("%f", &carros[i].combustivel);
		printf("\nMotorização: ", setlocale(LC_ALL, ""));
		scanf("%f", &carros[i].motorizacao);
		printf("\nValor: ");
		scanf("%f", &carros[i].valor);
	}
	printf("\n\n===============Estoque Geral ===============");
	for(i = 0; i < 3; i++)
	{
		printf("\nMarca: %s", carros[i].marca);
		printf("\nModelo: %s", carros[i].modelo);
		printf("\nAno: %d", carros[i].ano);
		printf("\nCombustível: %f", carros[i].combustivel,setlocale(LC_ALL, ""));
		printf("\nMotorização: %f", carros[i].motorizacao,setlocale(LC_ALL, ""));
		printf("\nValor: %f", carros[i].valor);
	}
}