#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Hello world";
	char ch='w';
  char *ptr = memchr(str, ch , strlen(str)); 

    if(ptr != NULL)
        printf("Character found at position: %u\n", ptr - str);
    else
        printf("Character not found\n");

   
}
