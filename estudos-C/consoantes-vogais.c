#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

int comparaLetra(char a)
{
    a = toupper(a);
    switch (a)
    {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            return 1;
            break;
        case 32:
            return 2;
            break;
        default:
            return 0;
            break;
    }

}

int main()
{
    char *nome;
    int a, tamanho = 0;

    printf("Informe o nome: ");
    //__fpurge(stdin);
    scanf("%[^\n]s", nome);

    tamanho = strlen(nome);

    for(a; a<tamanho; a++)
    {
        if (comparaLetra(nome[a]) == 1)
        {
            printf("%c é vogal.", nome[a]);
        }
        else if(comparaLetra(nome[a]) == 2)
        {
            printf("\nespaço em branco localizado.\n");
        }
        else
        {
            printf("%c é consoante.", nome[a]);
        }
        printf("\n");
    }

    return 0;
}