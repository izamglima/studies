#include<stdio.h>

void calculoHab() {
	
	#define teto 750
	char stop = 's';
	float salario = 0, maior_salario = 0, media_salario = 0, ac_salario = 0, porcent_teto = 0;
	int i = 0, filhos = 0, ac_filhos = 0, media_filhos = 0, qtd_teto = 0;
	
	do
	{
		printf("\nEscreva o salario: \n");
		scanf("%f", &salario);
		
		printf("\nEscreva numero de filhos: ");
		scanf("%d", &filhos);
		
		if (salario > maior_salario)
			maior_salario = salario;
		
		if (salario <= teto)
			qtd_teto++;
		
		//calculos
		i++;
		ac_salario += salario;
		ac_filhos += filhos;
		
		media_salario = ac_salario / i ;
		media_filhos = ac_filhos / i;
		porcent_teto = (qtd_teto * 100) / i ;
		
		printf("\nDeseja parar a pesquisa? ");
		scanf("\n %c", &stop);
		
	}while(stop != 's');
	
	printf("\nA media de salarios eh de R$: %.2f", media_salario);
	printf("\nA media de filhos eh de: %d", media_filhos);
	printf("\nO maior salario eh de R$: %.2f ", maior_salario);
	printf("\nA porcentagem de pessoas com ganhos ate R$750,00: %.f%%", porcent_teto);
}

int main()
{
	calculoHab();
	return 0;
}