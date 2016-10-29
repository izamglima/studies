#include <stdio.h>

struct filme {
	char nome[100];
	int ano_producao;
	char ator_principal[100];
};

#define FILMES 2
struct filme filmes[FILMES];
int mais_novo = 0;
int i;
int temp = 0;

void ler_catalogo() 
{

	for (i = 0 ; i < FILMES; i++ ) {
		
		printf("\nDigite o nome: ");
		scanf("%s", &filmes[i].nome);
			
		printf("\nDigite o ano de producao: ");
		scanf("%d", &filmes[i].ano_producao);
			
		printf("\nDigite o ator principal: ");
		scanf("%s", &filmes[i].ator_principal);
	}
}

void check_ultimo_prod() {
	for(i = 0 ; i < FILMES; i++ ) {
		
		if (filmes[i].ano_producao > mais_novo) {				
			mais_novo = filmes[i].ano_producao;	
			temp = i;
		}		
	}
	printf("\nNome do filme: %s", filmes[temp].nome);
	printf("\nAtor principal: %s", filmes[temp].ator_principal);
	printf("\nFilme mais recente (ano producao): %d",  mais_novo);
}

void check_ultimo_add() {
	printf("\nNome: %s ", filmes[FILMES - 1].nome);
	printf("\nAtor Principal: %s ", filmes[FILMES - 1].ator_principal);
	printf("\nAno de Producao: %d ", filmes[FILMES - 1].ano_producao);
}

void menu() 
{
	int escolha = 0;
	while (escolha!=4)
	{
		printf("\n 1 - Inserir no catalogo. ");
		printf("\n 2 - Mostrar filme mais novo (ano de producao). ");
		printf("\n 3 - Mostrar ultimo adicionado. ");
		printf("\n 4 - Sair \n");
		printf("\n Digite sua escolha: ");
		scanf("%d", &escolha);
		
		switch (escolha) {
		
			case 1:
			{
				printf("\n\n 1 - Inserir no catalogo. \n");
				ler_catalogo();		
				break;
			}
			case 2:
			{
				printf("\n\n 2 - Mostrar filme mais novo (ano de producao). \n");
				check_ultimo_prod();
				break;
			}
			case 3:
			{
				printf("\n\n 2 - Mostrar ultimo adicionado. \n");
				check_ultimo_add();
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
