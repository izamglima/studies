#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int valor;
}TItem;

typedef struct elemento {
	struct elemento *pProx;
	TItem item;
}TElemento;

typedef struct {
	TElemento *pPrimeiro, *pUltimo;
}TPilha;


// inicia uma pilha vazia
void Pilha_Inicia(TPilha *pilha) {
	pilha->pPrimeiro = NULL;
	pilha->pUltimo = NULL;	
}

// insere o item x no topo da pilha
void Pilha_Empilha(TPilha *pilha, TItem x) {
	TElemento *novo = malloc(sizeof(TElemento));
	
	novo->item = x;
	novo->pProx = NULL;
	
	if(Pilha_EhVazia(pilha)) {
		pilha->pPrimeiro = novo;
		pilha->pUltimo = novo;
	} else {
		pilha->pUltimo->pProx = novo;
		pilha->pUltimo = novo;
	}
}
// retira o item x do topo da pilha
int Pilha_Desempilha(TPilha *pilha){
	if (Pilha_EhVazia(pilha)) {
    	return 0;
	} 
	
	TElemento *remove = pilha->pUltimo;
	TElemento *novoUltimo = pilha->pPrimeiro;
	int valor = remove->item.valor;
	
	if (remove == novoUltimo) {
		Pilha_Inicia(pilha);
	} else {
		do {
		  novoUltimo = novoUltimo->pProx;
		} while(remove != novoUltimo->pProx);
	}
	
	free(remove);
	novoUltimo->pProx = NULL;
	pilha->pUltimo = novoUltimo;
	
	return valor;
}

//retorna true se a pilha está vazia, e false caso contrário
int Pilha_EhVazia(TPilha *pilha) {
	return pilha->pPrimeiro == NULL;
}

void Pilha_Imprime(TPilha *pilha) {
	TElemento *atual = malloc(sizeof(TElemento));
	atual = pilha->pPrimeiro;
	printf("Inicio da pilha: ");
	while(atual != NULL) {
		printf(" %d ", atual->item.valor);
		atual = atual->pProx;
	}
	printf(" Fim da pilha \n");
}

void main(){
 	
	TPilha pilha;
	
 	Pilha_Inicia(&pilha);
 
	if (Pilha_EhVazia(&pilha)) {
		printf("Pilha eh vazia\n");
	} else {
		printf("Pilha nao eh vazia");
	}
 
 	TItem meuItem;
 	meuItem.valor = 55;
 	Pilha_Empilha(&pilha, meuItem);
  	meuItem.valor = 22;
  	Pilha_Empilha(&pilha, meuItem);
  	meuItem.valor = 88;
  	Pilha_Empilha(&pilha, meuItem);
  	
	Pilha_Imprime(&pilha);
	
	Pilha_Desempilha(&pilha);
	Pilha_Imprime(&pilha);
}
