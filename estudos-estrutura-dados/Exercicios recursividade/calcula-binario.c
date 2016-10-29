#include <stdio.h>


int CalculaBinario(int i) {
	int r, k = 0;
	do {
		r = i / 2;
		i = r;
		k++;
	} while (r != 0);
	
	return k;
}

int CalculaBinarioRe(int i, int k) {
	int r;
	r = i / 2;
	++k;
	
	printf("\n %d", i);
	
	if (r == 0) {
		return k;
	} else {
		i = r;	
		return CalculaBinarioRe(i, k);
	}
}

int main(void)
{
	
	printf("\n Numero de digitos binarios de um inteiro: %d", CalculaBinarioRe(138, 0));
	return 0;
}
