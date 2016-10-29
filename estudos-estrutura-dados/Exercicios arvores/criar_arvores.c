#include <stdio.h>
#include <stdlib.h>

typedef struct  Arv {
    int info;
    struct Arv* dir;
    struct Arv* esq;
} arv; //apelido do struct

//cria arvore vazia
int arv_criarVazia( ){
    return NULL;
}
//função arv_cria
// cria um nó raiz dadas a informação e as duas sub-árvores, a da esquerda e a da direita
// retorna o endereço do nó raiz criado
arv* arv_cria(int n, arv* subEsq, arv* subDir ){
    arv* p = (arv*)malloc(sizeof(arv));
    p->info = n;
    p->dir = subDir;
    p->esq = subEsq;
    return p;
}

int arv_pertence(arv* a, int n){
    if(arv_vazia(a)) {
        return 0;
    } else {
        //retorna 1 se estiver presente logo no 1º ou se não função chama ela mesma para verificar primeiro direita depois esquerda
        return a->info == n || arv_pertence(a->esq, n) || arv_pertence(a->dir, n);
    }
}

int arv_vazia(arv* a) {
    return (a == NULL);
}

void deletaArvore() {
    // ??
}

void arv_imprime(arv* a) {
    if(!arv_vazia(a)) {
        printf("\n %i \n", a->info);
        arv_imprime(a->esq);
        arv_imprime(a->dir);
    }
}

int main(){
    arv* arvIza =  arv_criarVazia();
    arv* arvIza2;
    arv* arvIza3;

    //cria arvore
    arvIza = arv_cria(2, NULL, NULL); //esq dir
    arvIza = arv_cria(2, NULL, NULL); //esq dir
    arvIza2 = arv_cria(4, NULL, arvIza); //esq dir
    arvIza3 = arv_cria(6, arvIza, arvIza2); //esq dir

    //teste se vazia
    if(arv_vazia(arvIza) == 1) {
        printf("%s", "\nArvore vazia\n");
    } else {
        printf("%s", "\nArvore nao vazia\n");
    }

    //testa se pertence
    if(arv_pertence(arvIza, 2)) {
        printf("%s",  "\nSim pertence!\n");
    } else {
        printf("%s" , "\nNao pertence :( \n" );
    }

    printf("Print da arvore:");
    arv_imprime(arvIza3);

    return 0;
}
