
int main() {
	
	int mat[4], *p, x;
	printf("Valor de p : %d\n", p);
	printf("Valor de mat : %d\n", mat);
	
	p = mat + 1;
	printf("Valor de p = mat + 1: %d\n", p); 
	
	//p = mat++; 
	//não se pode incrementar um vetor desta maneira, precisa acessar o índice

	
	//p = ++mat; 
	//não se pode incrementar um vetor desta maneira, precisa acessar o índice

	
	x = (*mat)++;
	printf("Valor de x: %d", x);
	
}

