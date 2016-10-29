void main(void)
{
	int *n;
	int i;
	int t;
	
	printf("Digite quantas casas seu vetor vai ter: ");
	scanf("%d", &t);
	n = &t;
	
	int vetor[*n];
	printf("Entre com os %d valores do vetor de inteiros: \n", *n);
	
	for (i = 0; i < *n; i++) 
	{
		scanf("%d", &vetor[i]);
	}
	
	printf("Valores entrados no vetor: \n");
	
	for (i = 0; i < *n; i++) 
	{
		printf("Casa %d - valor: %d\n", i, vetor[i]);
	}
}
