void main(void)
{
	int i=7, j=3; //cria dois inteiros

	int *p; // cria um ponteiro p
	
	int **r; //cria um ponteiro pro ponteiro de r
	
	p = &i; //p recebe o endereço de i
	printf("p: %d\n", *p);
	
	r = &p; //r recebe o endereço de p
	printf("*r: %d\n", *r);
	printf("**r: %d\n", **r);
	
	int c = **r + j; //ponteiro de ponteiro de r soma com 3 e atribui a c
	printf("c: %d\n", c);
}
