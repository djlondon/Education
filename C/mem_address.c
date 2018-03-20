#include <stdio.h>

int y = 20;

int main(){
	int x = 30;
	printf("y is stored at %p\n x is stored at %p", &y, &x);
	return 0;
}