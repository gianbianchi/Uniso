#include<stdio.h>
int main(){
    float n1,n2;
    printf("Distância percorrida (Km): ");
    scanf("%f", &n1);
    printf("Combustivel (L): ");
    scanf("%f", &n2);

    printf("O consumo médio é: %.2f Km/L", n1/n2);
    return 0;
}