

int main() 
{
	int i=99, j;

	int *p; 
	
	p = &i; //endereço do i e não o valor
	
	j = *p + 200; // j recebe valor de um ponteiro e soma 200

	printf("Valor de p: %d\n", *p );
	printf("Valor de p: %d\n", &p );
	printf("Valor de j: %d", j );
	
	return 0;
}
