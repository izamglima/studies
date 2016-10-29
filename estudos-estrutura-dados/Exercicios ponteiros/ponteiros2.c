
int main() {
	int x, y, *p; 
	
	y = 0; 
	p = &y; //endereço de y (valor - 0)
	x = *p; //valor de p
	printf("valor de x: %d\n", x);
	x = 4;  // x recebe valor 4
	printf("valor de x: %d\n", x);
	(*p)++; // 0 + 1
	printf("valor de *p: %d\n", *p);
	--x; // 4 - 1
	printf("valor de x: %d\n", x);
	(*p) += x;	// ponteiro de p, 1 + 3
	printf("valor de *p += x: %d\n", *p);
	
	return 0;
}

