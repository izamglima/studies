void main(void)
{
	int x, *p;
	
	x = 100;
	
	p = x; // n�o � atribu�do o endere�o de x
	
	printf("Valor de p: %d.\n", *p); //n�o consegue achar o valor de p

}
