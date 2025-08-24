#include <stdio.h>
#include <string.h>

int main() {
    char str1[] = "aaabbbxyz";
    char str2[] = "ab";

   int res = strspn(str1, str2);

    printf("Number of characters at start only from 'a' and 'b': %d\n", res);
    
}
