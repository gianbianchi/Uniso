#include<stdio.h>

int main(){
    int a,b,c;

    printf("Valor A: ");
    scanf("%d", &a);
    printf("Valor B: ");
    scanf("%d", &b);

    c = a;
    a = b;
    b = c;

    printf("O valor de A é %d e o valor de B é %d", a, b);
    return 0;
}