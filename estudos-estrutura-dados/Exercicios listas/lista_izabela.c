#include <stdio.h>
#include <stdlib.h>

#define MAX 1000

typedef struct {
  int value;
} TItem;

typedef struct {
  TItem item[MAX];
  int first, last;
} TList;

void TList_Print(TList *pList);
void TList_MakeEmpty(TList *pList);
int TList_IsEmpty(TList *pList);
int TList_Insert(TList *pList, int p, TItem x);
int TList_Remove(TList *pList, int p, TItem *pX);
int TList_Get(TList *pList, int p, TItem *pX);
int TList_Tamanho(TList *pList);

void TList_Print(TList *pList) {
  if (TList_IsEmpty(pList)) {
    printf("Empty list.\n");

    return;
  }

  for (int i=0; i<=pList->last; i++) {
    int value = pList->item[i].value;
    printf("%d: %d\n", i+1, value);
  }
}

void TList_MakeEmpty(TList *pList) {
  for (int i=0; i<MAX; i++) {
    pList->item[i].value = -1;
  }

  pList->first = -1;
  pList->last = -1;
};

int TList_IsEmpty(TList *pList) {
  return TList_Tamanho(pList) <= 0;
};

int TList_Insert(TList *pList, int p, TItem item) {
  // Se a lista estiver vazia define a primeira posição da lista
  if (pList->first == -1) {
    pList->first = 0;
  }

  if (p <= pList->last) {
    // Se a inserção for feita no meio da lista,
    // move todos os items uma posição a frente da atual
    // e atualiza a última posição da lista
    for(int i=pList->last; i<=p && i>=0; i--) {
      pList->item[i+1].value = pList->item[i].value;
    }

    pList->last++;
  } else {
    // Se a inserção for feita no fim da lista apenas atualiza a última posição
    pList->last = p;
  }

  // Insere o valor na posição desejada
  pList->item[p] = item;

  return item.value;
}

int TList_Remove(TList *pList, int p, TItem *pX) {
  // Pega o valor do item que precisa se removido e limpa esse item
  pX->value = pList->item[p].value;
  pList->item[p].value = -1;

  if (pList->last > p) {
    // Se o item a ser removido estiver no meio da lista,
    // move todos os items para uma posição anterior a atual
    for(int i=p; i<pList->last; i++) {
      pList->item[i] = pList->item[i+1];
    }

    // Após mover os items, limpa a última posição,
    pList->item[pList->last].value = -1;
  }

  // Atualiza a última posição da lista
  pList->last--;

  // Se após remover o elemento a lista estiver vazia,
  // limpa a primeira posição da lista
  if (TList_IsEmpty(pList)) {
    pList->first = -1;
  }

  return pX->value;
};

// Pega o valor da lista e coloca no item pX passado por parametro
int TList_Get(TList *pList, int p, TItem *pX) {
  pX->value = pList->item[p].value;

  return pX->value;
}

// O tamanho da lista deve ser o indice do último item mais 1
int TList_Tamanho(TList *pList) {
  int tamanho = pList->last + 1;
  return tamanho;
}

int main() {
  // Cria a lista
  TList *list = malloc(sizeof(TList));
  // Limpa o lixo da lista
  TList_MakeEmpty(list);
  printf("tamanho: %d\n", TList_Tamanho(list));
  TList_Print(list);

  // Fala se a lista é vazia
  if (TList_IsEmpty(list) > 0) {
    printf("vazio\n");
  } else {
    printf("Não é vazio\n");
  }

  // Cria um item para ser inserido na lista
  TItem item;
  item.value = 42;
  TList_Insert(list, 0, item);
  printf("tamanho: %d\n", TList_Tamanho(list));
  TList_Print(list);

  if (TList_IsEmpty(list) > 0) {
    printf("É vazio\n");
  } else {
    printf("Não é vazio\n");
  }

  // Troca o valor para inserir outro item na lista
  item.value = 666;
  TList_Insert(list, 0, item);
  printf("tamanho: %d\n", TList_Tamanho(list));
  TList_Print(list);

  // Cria outro item para armazenar o item removido da lista
  TItem removedItem;
  TList_Remove(list, 0, &removedItem);
  printf("item removido: %d\n", removedItem.value);
  printf("tamanho: %d\n", TList_Tamanho(list));
  TList_Print(list);

  // Cria outro item para armazenar o item recuperado da lista
  TItem retrievedItem;
  TList_Get(list, 0, &retrievedItem);
  printf("item recuperado: %d\n", retrievedItem.value);

  return 0;
}