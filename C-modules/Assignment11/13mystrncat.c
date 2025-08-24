// User-defined mystrncat function
#include <stdio.h>
void mystrncat(char*,char*, int);
void main() {
    char str1[50] = "Hello";
    char str2[50] = "World!";
    int n;

    printf("Enter number of characters to concatenate: ");
    scanf("%d", &n);

    mystrncat(str1, str2, n);

    printf("Result after mystrncat: %s\n", str1);

    
}
//start
void mystrncat(char *brr1, char *brr2, int n) {
   
   int j=0;
    while (brr1[j]!='\0'){
    	brr1++;
	} 

    
    int i = 0;
    while (i < n && brr2[i]) {
        brr1[i] = brr2[i];
        i++;
    }

   
    brr2[i] = '\0';
}