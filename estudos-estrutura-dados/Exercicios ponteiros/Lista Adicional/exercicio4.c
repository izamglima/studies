void main(void)
{
	int x = 100, *p, **pp; //cria uma vari�vel x com valor 100. cria um ponteiro p e um ponteiro pro ponteiro de p

	p = &x; //atribui a p o endere�o de x
	
	pp = &p; // atribui a pp o endere�o de p
	
	printf("Valor de pp: %d\n", **pp); //printa o valor de pp
	printf("Valor de p: %d\n", *p); //printa o valor de *p
}
