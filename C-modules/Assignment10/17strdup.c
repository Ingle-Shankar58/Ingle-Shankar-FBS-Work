#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    char str[] = "Helloworld";
    
	char* brr = strdup(str);
    printf("%s",brr);
}
