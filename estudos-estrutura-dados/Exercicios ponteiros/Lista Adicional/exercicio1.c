void main(void)

{
	int a=5, b=12; //cria duas vari�veis do tipo inteiro
	
	int *p; //cria um pointeiro p
	
	int *q; // cria outro ponteiro q
	
	p = &a; // atribui o endere�o de a para ponteiro p
	printf("p: %d\n", *p);
	
	q = &b; // q recebe o endere�o de b
	printf("q: %d\n", *q);
	
	int c = *p + *q; // cria um inteiro c e atribui a soma dos dois ponteiros
	printf("c: %d\n", c);
}
