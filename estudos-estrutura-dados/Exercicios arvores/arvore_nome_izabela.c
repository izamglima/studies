#include <stdio.h>
#include <stdlib.h>

typedef struct  Arv {
    char info;
    struct Arv* dir;
    struct Arv* esq;
} arv; //apelido do struct

//função arv_cria
// cria um nó raiz dadas a informação e as duas sub-árvores, a da esquerda e a da direita
// retorna o endereço do nó raiz criado
arv* arv_cria(char n, arv* subEsq, arv* subDir ){
    arv* p = (arv*)malloc(sizeof(arv));
    p->info = n;
    p->dir = subDir;
    p->esq = subEsq;
    return p;
}


int arv_pertence(arv* a, char n){
    if(arv_vazia(a)) {
        return 0;
    } else {
    	if(a->info == n) {
    		return 1;	
		} else if (arv_pertence(a->esq, n)) {
			return 1;
		} else if (arv_pertence(a->dir, n)) {
			return 1;
		}
    }
}

int arv_vazia(arv* a) {
    return (a == NULL);
}


//imprime pre-ordem
void pre_ordem(arv* a) {
    if(!arv_vazia(a)) {
        printf(" %c \n", a->info);
        pre_ordem(a->esq);
        pre_ordem(a->dir);
    }
}

//imprime in-ordem
void in_ordem(arv* a) {
	if(!arv_vazia(a)) {
		in_ordem(a->esq);
		printf(" %c \n", a->info);
		in_ordem(a->dir);
	}
}

//imprime pos-ordem
void pos_ordem(arv* a) {
	if(!arv_vazia(a)) {
		pos_ordem(a->esq);
		pos_ordem(a->dir);
		printf(" %c \n",a->info);
	}
}



int main(){
	
	arv* arvIza = arv_cria('b', arv_cria('e', NULL,
		arv_cria('l', NULL, NULL)	
		),

		arv_cria('a', NULL, NULL)
	); 
	
	//arv* arvTeste = arv_cria('i', arv_cria('a', NULL, NULL), arv_cria('z', NULL, NULL));

    //teste se vazia
    if(arv_vazia(arvIza) == 1) {
        printf("%s", "\nArvore vazia\n");
    } else {
        printf("%s", "\nArvore nao vazia\n");
    }

    //testa se pertence
    if( arv_pertence(arvIza, 'a') == 1) {
        printf("%s",  "\nSim pertence!\n");
    } else {
        printf("%s" , "\nNao pertence :( \n" );
    }

    printf("Print da arvore pre-ordem:\n");
    pre_ordem(arvIza);
    printf("\nPrint da arvore in-ordem:\n");
    in_ordem(arvIza);
    printf("\nPrint da arvore pos-ordem:\n");
    pos_ordem(arvIza);

	
    return 0;
}
