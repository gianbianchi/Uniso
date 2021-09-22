#include<stdio.h>

int main(){
    float tempC, tempF;

    printf("Qual a temperatura em celsius? ");
    scanf("%f", &tempC);

    tempF = (9 * tempC + 160)/5;

    printf("A temperatura em Fahrenheit é %.2f", tempF);
    return 0;
}