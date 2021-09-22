#include<stdio.h>

int main(){
    float n1,n2;

    printf("N1: ");
    scanf("%f", &n1);
    printf("N2: ");
    scanf("%f", &n2);

    printf("\nA soma é: %f", n1+n2);
    printf("\nA subtração é: %f", n1-n2);
    printf("\nA multiplicação é: %f", n1*n2);
    printf("\nA divisão é: %f", n1/n2);
    return 0;
}