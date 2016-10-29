# include <stdio.h>

int main()
{
char check = 'n';
int h, v, qtd;
int acidentes[4][6] =
{
{0, 0, 0, 0, 0, 0},
{0, 0, 0, 0, 0, 0},
{0, 0, 0, 0, 0, 0},
{0, 0, 0, 0, 0, 0}
};

do
{
printf("Escreva em qual rua leste-oeste foi o acidente\n (entre os valores - 0,1,2,3) : ");
scanf("%d", &h);

printf("\nEscreva em qual rua norte-sul foi o acidente\n (entre os valores - 0,1,2,3,4,5) : ");
scanf("%d", &v);

printf("\nQuantos acidentes ocorreram neste cruzamento?\n");
scanf("%d", &qtd);

if (h >= 0 && h < 4 && v >= 0 && v < 6)
{
acidentes[h][v] = qtd;
printf("Acidente armazenado com sucesso.\n");
} else {
printf("Nao foi possivel gravar o acidente.\n");
}

printf("\nOcorreram mais acidentes? \n");
scanf("\n %c", &check);

} while (check != 'n');

int i, j;
for(i = 0; i < 4; i++) {
for(j = 0; j < 6; j++){
printf("\n Acidentes registrados no cruzamento da rua %d com %d: %d ", i, j, acidentes[i][j]);
}
}

return(0);
}