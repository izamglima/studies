#include <stdio.h>


int fat(int n) {
	if (n == 0) 
		return 1;
	else 
		return n * fat(n - 1);
}
 
void main(void)
{
	printf("%d", fat(5));
   	return 0;
}
 

