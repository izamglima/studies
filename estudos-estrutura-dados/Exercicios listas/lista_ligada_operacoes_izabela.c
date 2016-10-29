#include <stdio.h>
#include <stdlib.h>

typedef struct {
  int valor;
} TItem;

typedef struct elemento {
  struct elemento *pProx;
  TItem item;
} TElemento;

typedef struct {
  TElemento *pPrimeiro, *pUltimo;
} TLista;

void FazListaVazia(TLista *pLista);
int ListaEhVazia(TLista *pLista);
int InsereInicioLista(TLista *pLista, int p);
int InsereFinalLista(TLista *pLista, int p);
int RetiraInicioLista(TLista *pLista);
int RetiraFinalLista(TLista *pLista);
void ImprimeLista(TLista *pLista);
int TamanhoLista(TLista *pLista);
int TLista_OrdenaLista(TLista *pLista);
int TLista_InsereOrdenado(TLista *pLista, TItem item);

void FazListaVazia(TLista *pLista) {
  pLista->pPrimeiro = NULL;
  pLista->pUltimo = NULL;
}

int ListaEhVazia(TLista *pLista) {
  return pLista->pPrimeiro == NULL && pLista->pUltimo == NULL;
}

int InsereInicioLista(TLista *pLista, int p) {
  TItem item;
  item.valor = p;

  TElemento *elemento = malloc(sizeof(TElemento));
  elemento->item = item;
  elemento->pProx = pLista->pPrimeiro;

  pLista->pPrimeiro = elemento;

  if (pLista->pUltimo == NULL) {
    pLista->pUltimo = elemento;
  }

  return item.valor;
}

int InsereFinalLista(TLista *pLista, int p) {
  TElemento *elemento = malloc(sizeof(TElemento));
  elemento->item.valor = p;
  printf("porra");
  elemento->pProx = NULL;

	pLista->pUltimo->pProx = elemento;
  pLista->pUltimo = elemento;

  if (pLista->pPrimeiro == NULL) {
    pLista->pPrimeiro = elemento;
  }

  return pLista->pUltimo->item.valor;
}

int RetiraInicioLista(TLista *pLista) {
  if (pLista->pPrimeiro == NULL) {
    return 0;
  }

  TElemento *elemento;
  elemento = pLista->pPrimeiro;

  pLista->pPrimeiro = elemento->pProx;

  free(elemento);
  return 1;
}

int RetiraFinalLista(TLista *pLista) {
  if (ListaEhVazia(pLista)) {
    return 0;
  }

  TElemento *remove = pLista->pUltimo;
  TElemento *novoUltimo = pLista->pPrimeiro;
  int valor = remove->item.valor;

  if (remove == novoUltimo) {
    FazListaVazia(pLista);
  } else {
    do {
      novoUltimo = novoUltimo->pProx;
    } while(remove != novoUltimo->pProx);
  }

  free(remove);
  novoUltimo->pProx = NULL;
  pLista->pUltimo = novoUltimo;

  return valor;
}

void ImprimeLista(TLista *pLista) {
  if (ListaEhVazia(pLista)) {
    printf("\tLista eh vazia\n");
  } else {
    TElemento *imprime = pLista->pPrimeiro;

    while(imprime != NULL) {
      printf("\t%d\n", imprime->item.valor);
      imprime = imprime->pProx;
    }
  }
}

int TamanhoLista(TLista *pLista) {
  int tamanho = 0;

  TElemento *elemento = pLista->pPrimeiro;
  while(elemento != NULL) {
    tamanho++;
    elemento = elemento->pProx;
  }

  return tamanho;
}

int TLista_OrdenaLista(TLista *pLista) {
   if (ListaEhVazia(pLista)) {
    return 0;
  }

  int aux;
  TElemento *atual = malloc(sizeof(TElemento));
  TElemento *proximo = malloc(sizeof(TElemento));

	atual = pLista->pPrimeiro;
	proximo = atual->pProx;

	while(atual->pProx != NULL) {
    while(proximo != NULL) {
      if (atual->item.valor > proximo->item.valor) {
				aux = atual->item.valor;
				atual->item.valor = proximo->item.valor;
				proximo->item.valor = aux;
      }

      proximo = proximo->pProx;
    }

    atual = atual->pProx;
    proximo = atual->pProx;
  }

  return 0;
}

int TLista_InsereOrdenado(TLista *pLista, TItem item) {
  InsereInicioLista(pLista, item.valor);
  TLista_OrdenaLista(pLista);
}

int main() {

  TLista *lista = malloc(sizeof(TLista));
  FazListaVazia(lista);

  InsereInicioLista(lista, 4);

  InsereInicioLista(lista, 1);

  InsereInicioLista(lista, 2);

  InsereInicioLista(lista, 3);

  InsereInicioLista(lista, 5);

  if (ListaEhVazia(lista)) {
    printf("Lista e vazia\n");
  } else {
    printf("Lista nao e vazia\n");
  }

  printf("\n");
  printf("Insere no fim 55\n");
  InsereFinalLista(lista, 55);

  printf("\n");
  printf("Imprime lista\n");
  ImprimeLista(lista);

	printf("\n");
	printf("Ordena a lista:\n");
	TLista_OrdenaLista(lista);

  printf("\n");
  printf("Imprime lista\n");
  ImprimeLista(lista);

  TItem item;
  item.valor = 45;
  printf("\n");
  printf("Insere Ordenado\n");
  TLista_InsereOrdenado(lista, item);
  printf("\n");
  printf("Imprime lista\n");
  ImprimeLista(lista);
}
