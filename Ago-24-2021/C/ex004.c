#include<stdio.h>

int main(){
    float n1,n2,total;
    int n3;
    
    printf("No. do vendedor: ");
    scanf("%d", &n3);
    printf("Salario fixo do vendedor: ");
    scanf("%f", &n1);
    printf("Qual o valor em vendas: ");
    scanf("%f", &n2);

    total = n1 + (n2 * 0.15);

    printf("\nA comissao será: R$%.2f", n2 * 0.15);
    printf("\nO salario final é: R$%.2f", total);
    return 0;
}