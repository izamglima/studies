#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>

#define CARROS 1 //alterar aqui o valor
int i;
	
struct veiculo {
	char modelo[50];
	int ano;
	char cor[25];
	float preco;
} catalogo[CARROS];

void ler_catalogo() 
{

	for(i = 0 ; i < CARROS; i++ ) {
		
		printf("\nDigite o modelo: ");
		scanf("%s", &catalogo[i].modelo);
			
		printf("\nDigite o ano: ");
		scanf("%d", &catalogo[i].ano);
			
		printf("\nDigite a cor: ");
		scanf("%s", &catalogo[i].cor);
				
		printf("\nDigite o preco: ");
		scanf("%f", &catalogo[i].preco);
	}
	system("cls");
}

bool proposta_menor_preco(struct veiculo veiculo, float proposta)
{
	return veiculo.preco <= proposta;
}

void recebe_proposta()
{
	float proposta;
	printf("Valor da proposta: ");
	scanf("%f", &proposta);
	
	for(i = 0 ; i < CARROS; i++ ) {
		if(proposta_menor_preco(catalogo[i], proposta)) {
			printf("\nModelo: %s", &catalogo[i].modelo);
			printf("\nCor: %s", &catalogo[i].cor);
			printf("\nAno: %d \n\n", catalogo[i].ano);
		}		
	}
}

void busca_modelo()
{
	char modelo[20];
	printf("Digite o modelo: ");
	scanf("%s", &modelo);	
	
	for(i = 0 ; i < CARROS; i++ ) {
		if(strcmp(catalogo[i].modelo, modelo) == 0){
			printf("\nPreco: %f", catalogo[i].preco);
			printf("\nAno: %d", catalogo[i].ano);
			printf("\nCor: %s \n\n", &catalogo[i].cor);
		}
	}
}

bool comparaStringModelo(struct veiculo veiculo, char str_comparar[75]) 
{
	int equals;
	equals = strcmp(veiculo.modelo, str_comparar);
	return equals == 0;	
}

bool comparaStringCor(struct veiculo veiculo, char str_comparar[75]) 
{
	int equals;
	equals = strcmp(veiculo.cor, str_comparar);
	return equals == 0;	
}


void busca_geral() {
	char modelo[20];
	int ano;
	char cor[20];
	printf("Digite o modelo: ");
	scanf("%s", &modelo);
	printf("Digite o ano: ");
	scanf("%d", &ano);
	printf("Digite a cor: ");
	scanf("%s", &cor);
	
	for(i = 0 ; i < CARROS; i++) {
		if( comparaStringModelo(catalogo[i], modelo ) && 
			comparaStringCor(catalogo[i], cor) && 
			ano == catalogo[i].ano ) 
		{
			printf("\nExiste um carro com estas caracteristicas! \nSeu valor é: R$: %f \n\n", catalogo[i].preco );
		}
	}
	
}

void menu() 
{
	int escolha = 0;
	while(escolha!=5)
	{
		printf("\n============= MENU =============");
		printf("\n 1 - Inserir o catalogo. ");
		printf("\n 2 - Receber proposta ");
		printf("\n 3 - Busca por modelo ");
		printf("\n 4 - Busca por modelo, ano e cor ");
		printf("\n 5 - Sair \n");
		printf("\n Digite sua escolha: ");
		scanf("%d", &escolha);
		
		
		switch (escolha) {
		
			case 1:
			{
				printf("\n\n 1 - Inserir o catalogo. \n");
				ler_catalogo();		
				break;
			}
			case 2:
			{
				printf("\n\n 2 - Receber proposta \n");
				recebe_proposta();
				break;
			}
			case 3:
			{
				printf("\n\n 3 - Busca por modelo \n");
				busca_modelo();
				break;
			}
			case 4:
			{
				printf("\n\n 4 - Busca por modelo, ano e cor \n");
				busca_geral();
				break;
			}
		} 		
	}
}

int main() 
{

	menu();
	return 0;
}


