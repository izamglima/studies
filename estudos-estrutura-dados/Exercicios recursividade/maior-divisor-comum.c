#include <stdio.h>

int Euclides(int m, int n){
	int r;
	do {
		r = m % n;
		printf("\n r = m / n %d", r);
		m = n;
		printf("\n m = n %d", m);
		n = r;
		printf("\n n = r %d ", n);
	} while (r != 0);
	
	return m;
}

int EuclidesRe(int a, int b) {
	int c;
	
	c = a % b;
	//printf("c: %d", c);
	if (c == 0) {
		return b;
	} else {
		a = b;
		b = c;
		return EuclidesRe(a, b);
	}	 
}

int main(void)
{
	printf("Maior divisor comum de dois inteiros: %d", EuclidesRe(12, 18));
	
	return 0;
}
