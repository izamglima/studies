#include <stdio.h>
#include <stdlib.h>

#define INICIO 0
#define MAXTAM 1000

typedef struct{
    int valor;
}TItem;

typedef struct{
    TItem item[MAXTAM];
    int comeco, fim;
}TLista;

/* procedimentos e funcoes da TAD */
void TLista_FazVazia(TLista *pLista);
int TLista_EhVazia(TLista *pLista);
int TLista_Insere(TLista *pLista, TItem x);
int TLista_Retira(TLista *pLista, int p, TItem *pX);
void TLista_Imprime(TLista *pLista);

void TLista_FazVazia(TLista *pLista) {
    pLista->comeco = NULL;
}

int TLista_EhVazia(TLista *pLista) {
    return (pLista->comeco == NULL);
}

int TLista_Insere(TLista *pLista, TItem x) {
	pLista->fim = x.valor;
}


int main(int argc, char *argv[]){
    // Cria uma variavel do tipo lista
    TLista minhaLista;

    TLista_FazVazia(&minhaLista);

    //Fala se a lista é vazia
    if (TLista_EhVazia(&minhaLista) > 0) {
        printf("vazio\n");
    } else {
        printf("Nao eh vazio\n");
    }
    
    //instancia um valor para ser inserido
    TItem item1;
	item1.valor = 22;
	
	TLista_Insere(&minhaLista, item1);
	
    return 0;
}
