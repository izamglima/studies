#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>

int i;
// alterar aqui para 2000
#define MIMOSAS 20

struct data {
	int mes;
	int ano;
};

struct mimosas {
	int codigo;
	float litros_leite;
	float alim_kg;
	bool abate;
	struct data nasc;
} dados[MIMOSAS];

// alimenta estrutura com dados randomicos 
void fill_data()
{
	srand(time(NULL));
	for(i = 1; i <= MIMOSAS; i++) { 
		dados[i].codigo = i;
		dados[i].litros_leite = rand() % 60 + 30; 
		dados[i].alim_kg = rand() % 50 + 10; 
		dados[i].nasc.mes = rand() % 12 + 1; 
		dados[i].nasc.ano = rand() % 8 + 2008; 
	} 
}

// funcoes para retornar se vao para o abate
bool na_idade_de_abate(struct mimosas mimosa)
{
	return mimosa.nasc.ano < 2010;
}

bool baixa_producao(struct mimosas mimosa)
{
	return mimosa.litros_leite < 40;
}

bool producao_media_alto_consumo(struct mimosas mimosa)
{
	return 70 > mimosa.litros_leite > 50 && mimosa.alim_kg > 50;
}

// soma um caso for para o abate
void abate()
{
	for (i = 1; i < MIMOSAS; i++) {
		if(na_idade_de_abate(dados[i]) || baixa_producao(dados[i]) || producao_media_alto_consumo(dados[i])) {
			dados[i].abate = 1;
		}
	}
}

// funcao que faz a soma litros leite da semana

void qtd_leite()
{
	float soma_leite;
	for(i = 1; i < MIMOSAS; i++){
		soma_leite += dados[i].litros_leite;
	}
	printf("A soma dos litros de leite na semana é de %.2f L\n", soma_leite);
}

// funcao que faz a soma dos alimentos na semana
void total_alim()
{
	float soma_alim = 0;
	for(i = 0; i < MIMOSAS; i++){
		soma_alim += dados[i].alim_kg;
	}
	printf("A soma total do alimento consumido na semana eh de: %.2f Kg\n", soma_alim);
}

// funcao que soma os litros de leite apos abate
void litros_abate()
{
	float total_leite = 0;
	for(i = 0; i < MIMOSAS; i++){
		if (!dados[i].abate) {
			total_leite += dados[i].litros_leite;
		}
	}
	printf("O total de leite produzido na semana apos o abate eh de: %.2f L\n", total_leite);
}

// funcao que soma os alimentos consumidos apos abate
void alim_abate()
{
	float total_alim = 0;
	for (i = 0; i < MIMOSAS; i++) {
		if (!dados[i].abate) {
			total_alim += dados[i].alim_kg;
		}
	}
	printf("O total de alimento consumido na samana apos o abate eh de: %.2f Kg\n", total_alim);
}

// contagem das vaquinhas abatidas
void abatidos()
{
	int abatidos = 0;
	for (i = 0; i < MIMOSAS; i++) {
		if (dados[i].abate) {
			abatidos++;
		}
	}
	printf("O total de cabecas de gado abatidas eh: %d\n", abatidos);
}

// cria menu de opcoes 
void menu_opcoes()
{
	int escolha=1;
	while (escolha!=6)
	{
		printf("\n 1 - Ver quantidade total de leite produzida na semana. ");
		printf("\n 2 - Ver a quantidade total de alimento consumido na semana. ");
		printf("\n 3 - Quantidade total de leite produzido na semana apos o abate. ");
		printf("\n 4 - Quantidade total de alimentos produzidos na semana apos o abate. ");
		printf("\n 5 - Cabecas de gado para o abate. ");
		printf("\n 6 - Sair do programa. ");
		printf("\n\n Escolha uma opcao: ");
		scanf("%d",&escolha);
		
		switch (escolha) {
		
			case 1:
			{
				printf("\n\n~~~~ Opcao escolhida: 1) Ver quantidade total de leite produzida na semana ~~~~\n\n");
				qtd_leite();
				printf("\nRetornar ao menu.\n\n");
				break;
			}
			case 2:
			{
				printf("\n\n~~~~ Opcao escolhida: 2) Ver a quantidade total de alimento consumido na semana ~~~~\n\n");
				total_alim();
				printf("\nRetornar ao menu.\n\n");
				break;
			}
			case 3:
			{
				printf("\n\n~~~~ Opcao escolhida: 3) Quantidade total de leite produzido na semana apos o abate ~~~~\n\n");
				litros_abate();
				printf("\nRetornar ao menu.\n\n");
				break;
			}
			case 4:
			{
				printf("\n\n~~~~ Opcao escolhida: 4) Quantidade total de alimentos produzidos na semana apos o abate ~~~~\n\n");
				alim_abate();
				printf("\nRetornar ao menu.\n\n");
				break;
			}
			case 5:
			{
				printf("\n\n~~~~ Opcao escolhida: 5) Cabecas de gado para o abate ~~~~\n\n");
				abatidos();
				printf("\nRetornar ao menu.\n\n");
				break;
			}
		} 
	}//fim while
		if( escolha==6)
			printf("\n\n O Programa foi fechado"); 
}

int main()
{ 
	fill_data();
	abate();
	menu_opcoes();
	return 0;
}
