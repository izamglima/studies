#include <stdio.h>
#include <math.h>
#include <locale.h>
//Média com peso com acentuação
main()
{
    float nota_um, nota_dois, media;

    printf("Digite a nota da prova e do trabalho: \n");
    scanf("%f %f", &nota_um, &nota_dois);

    media = ((nota_um / 10)* 7) + ((nota_dois / 10) * 3);
    printf("Média final do aluno: %.2f", media, setlocale(LC_ALL, ""));

    if (media < 2) {
         printf("\nVocê foi reprovado! \n", setlocale(LC_ALL, ""));
        } else if (media < 6){
            printf("\nVocê está de recuperação! \n", setlocale(LC_ALL, ""));
        } else {
            printf("\nAprovado! \n",setlocale(LC_ALL, ""));
        }
}