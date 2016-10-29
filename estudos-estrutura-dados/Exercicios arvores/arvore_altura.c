#include <stdio.h>
#include <stdlib.h>

typedef struct  Arvore {
    int info;
    struct Arvore* dir;
    struct Arvore* esq;
} arv; //apelido do struct

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


arv* criaOrdenada (arv* a, int info)
{
    if (a==NULL) {
        a = (arv*)malloc(sizeof(arv));
        a->info = info;
        a->esq = NULL;
		a->dir = NULL;
    }else if (info < a->info){
        a->esq = criaOrdenada(a->esq, info);
    }else if (info > a->info){
        a->dir = criaOrdenada(a->dir, info);
    }

    return a;
}

arv* criaInversa(arv* a, int info) {
    if (a==NULL) {
        a = (arv*)malloc(sizeof(arv));
        a->info = info;
        a->esq = NULL;
		a->dir = NULL;
    }else if (info > a->info){
        a->esq = criaInversa(a->esq, info);
    }else if (info < a->info){
        a->dir = criaInversa(a->dir, info);
    }
}

arv* inverte(arv* a) {
	
	if (a==NULL) {
		return 0;
    }
	
	arv* novaArv;
	novaArv = (arv*)malloc(sizeof(arv));
	
	novaArv->dir = criaInversa(a->dir, a->info);
	novaArv->esq = criaInversa(a->esq, a->info);
   
    return novaArv;
}

arv* retira(arv* r, int info)
{
    if (r == NULL){
        return NULL;
    }else if (r->info > info){
        r->esq = retira(r->esq, info); //se o que está na raíz é maior, entra na esquerda
    }else if (r->info < info){
        r->dir = retira(r->dir, info); //se o que está na raíz é menor, entra na direita
    }else {
            if (r->esq == NULL && r->dir == NULL) { //se o nó não fiver filhos, remova a raíz
                free (r);
                r = NULL;
            }
            else if (r->esq == NULL) { //se a subárvore da esquerda estiver vazia
                arv* t = r; //aloca um nó temporario e joga o nó lá
                r = r->dir; // aponta para o filho da direita
                free (t); // ?? porque vai desalocar o t 
            }
            else if (r->dir == NULL) {
                arv* t = r;
                r = r->esq;
                free (t);
            }
            else {
                // SE tiver dois filhos
            }
        }
 return r;
}

int consulta(arv* a, int info){
	if(arv_vazia(a)) {
        return 0;
    } else {
    	if(a->info == info){
    		return 1;
		} else if (a->info > info) {
			consulta(a->esq, info);
		} else if(a->info < info ) {
			consulta(a->dir, info);
		}
	}
}

int arv_pertence(arv* a, int n){
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
        printf(" %d \n", a->info);
        pre_ordem(a->esq);
        pre_ordem(a->dir);
    }
}

//imprime in-ordem
void in_ordem(arv* a) {
	if(!arv_vazia(a)) {
		in_ordem(a->esq);
		printf(" %d \n", a->info);
		in_ordem(a->dir);
	}
}

//imprime pos-ordem
void pos_ordem(arv* a) {
	if(!arv_vazia(a)) {
		pos_ordem(a->esq);
		pos_ordem(a->dir);
		printf(" %d \n",a->info);
	}
}

int i = 0;
int quantidadeNos(arv* a) {
	if(!arv_vazia(a)) {
		i++;
        printf("Raiz numero %d \n", i);
        quantidadeNos(a->esq);
        quantidadeNos(a->dir);		
	}
	return i;
}

int altura (arv* a) {
   if (a == NULL) 
      return -1; // altura da árvore vazia
   else {
      int he = altura(a->esq);
      int hd = altura(a->dir);
      if (he < hd) return hd + 1;
      else return he + 1;
   }
}

//função inverte

int main(){
	
	arv* arvBinaria = arv_cria(5, arv_cria(4, NULL, NULL), arv_cria(8, NULL, NULL));
	
	arv* arvBuscaBinaria = NULL;

	arvBuscaBinaria = criaOrdenada(arvBuscaBinaria, 5);
	arvBuscaBinaria = criaOrdenada(arvBuscaBinaria, 4);
	arvBuscaBinaria = criaOrdenada(arvBuscaBinaria, 8);
	arvBuscaBinaria = criaOrdenada(arvBuscaBinaria, 7);
	arvBuscaBinaria = criaOrdenada(arvBuscaBinaria, 9);
	arvBuscaBinaria = criaOrdenada(arvBuscaBinaria, 3);
	
    //teste se vazia
    if(arv_vazia(arvBinaria) == 1) {
        printf("%s", "\nArvore vazia\n");
    } else {
        printf("%s", "\nArvore nao vazia\n");
    }

    //testa se pertence
    if( arv_pertence(arvBinaria, 4) == 1) {
        printf("%s",  "\nSim pertence!\n");
    } else {
        printf("%s" , "\nNao pertence :( \n" );
    }

    printf("Print da arvore pre-ordem:\n");
    pre_ordem( arvBinaria);
	printf("\nPrint da arvore in-ordem:\n");
    in_ordem( arvBinaria);
    printf("\nPrint da arvore pos-ordem:\n");
    pos_ordem( arvBinaria);

    printf("\nPrint da arvore ORDENADA in-ordem:\n");
    in_ordem(arvBuscaBinaria);

	printf("\n\n");
	int quantidade;
	quantidade = quantidadeNos(arvBuscaBinaria);
	printf("\nQuantidade total de nos: %d", quantidade);
	
	printf("\n\nConsulta arvore de busca binaria");
	if(consulta(arvBuscaBinaria, 9) == 1) {
		printf("%s",  "\nSim pertence!\n");
	} else {
		printf("%s" , "\nNao pertence :( \n" );
	}
	
	printf("\n\nAltura arvore de busca binaria: %d", altura(arvBuscaBinaria));
	
	arv* invertida = NULL;
	
	invertida = inverte(arvBuscaBinaria);
	printf("\nPrint da arvore invertida in-ordem:\n");
    in_ordem(invertida);
	
    return 0;
}
