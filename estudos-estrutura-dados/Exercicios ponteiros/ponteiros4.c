int main() 

{ 

	int y, *p, x; 
	
	y = 0; 
	p = &y; //p recebe endereço de y
	printf ("p = %d\n", p); 
	x = *p; //x recebe o valor de p
	printf ("x = %d\n", x); 
	x = 4; //x recebe 4
	printf ("x = %d\n", x); 
	(*p)++; //valor de p incrementado em 1
	printf ("y = %d\n", y); 
	x;
	printf ("x = %d\n", x); 
	(*p) += x; //ponteiro de p recebe 4 e soma com seu valor (1) 

	printf ("y = %d\n", y); // no fim y é alterado também pois tem um ponteiro *p apontando para ele

	printf ("*p = %d\n", *p); 
	
	return(0); 

}
