#include <stdio.h>
#include <stdlib.h>

typedef struct {
  int valor;
} TItem;

typedef struct elemento {
  struct elemento *pProx; //lista ligada
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
    while(remove != novoUltimo) {
      novoUltimo = novoUltimo->pProx;
    }
  }

  free(remove);
  novoUltimo->pProx = NULL;

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

int main() {
  printf("Faz lista vazia\n");
  TLista *lista = malloc(sizeof(TLista));
  
  FazListaVazia(lista);
  
  if (ListaEhVazia(lista)) {
    printf("Lista eh vazia\n");
  } else {
    printf("Lista nao eh vazia");
  }

  printf("\nInsere no inicio 42. ");
  InsereInicioLista(lista, 42);

  if (ListaEhVazia(lista)) {
    printf("\nLista eh vazia");
  } else {
    printf("\nLista nao eh vazia");
  }

  printf("\nInsere no fim 666.");
  InsereFinalLista(lista, 666);

  printf("\nTamanho da lista: ");
  printf("%d", TamanhoLista(lista));

  printf("\nImprime lista");
  ImprimeLista(lista);

  printf("\nRetira no inicio");
  RetiraInicioLista(lista);

  printf("\nRetira no fim");
  RetiraFinalLista(lista);

  printf("\nImprime lista: ");
  ImprimeLista(lista);

  
  printf("\nTamanho da lista: ");
  printf("%d", TamanhoLista(lista));
  
  return 0;
}
