void main(void)
{
	int x, *p;
	
	x = 100;
	
	p = x; // não é atribuído o endereço de x
	
	printf("Valor de p: %d.\n", *p); //não consegue achar o valor de p

}
