#include <stdio.h>
char* mystrnstr(char*,char*,int);
void  main() {
    const char *text = "Hello World, welcome!";
    const char *word = "World";
	int no=12;
    char *result = mystrnstr(text, word, no);

    if (result != NULL)
        printf("Found: %s\n", result);
    else
        printf("Not Found\n");

   
}
char *mystrnstr(char *haystack,char *needle, int len) {
    int i, j;

    if (*needle == '\0')   // ??? needle ???? ??
        return (char *)haystack;

    for (i = 0; i < len && haystack[i] != '\0'; i++) {
        j = 0;
        while (i + j < len && haystack[i + j] == needle[j]) {
            j++;
            if (needle[j] == '\0') {
                return (char *)&haystack[i];  // match ??? ???
            }
        }
    }
    return NULL;   // ??? needle ???? ????
}