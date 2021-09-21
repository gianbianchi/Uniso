#include<stdio.h>
#include<math.h>

int main(){
    float a, b, c, delta, x1, x2;

    printf("Valor de a: ");
    scanf("%f", &a);
    printf("Valor de b: ");
    scanf("%f", &b);
    printf("Valor de c: ");
    scanf("%f", &c);

    delta = pow(b,2) - 4*a*c;
    x1 = (sqrt(delta)-b)/(2*a);
    x2 = (-sqrt(delta)-b)/(2*a);

    if(delta < 0)
    {
        printf("\nNão existem raizes reais");
    }
    else
    {
        printf("\nEquação é: %.2fx² %.2fx %.2f", a, b, c);
        printf("\nRaiz 1 = %.2f", x1);
        printf("\nRaiz 2 = %.2f", x2);
    }

    return 0;
}