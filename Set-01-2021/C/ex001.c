#include <stdio.h>
#include <string.h>

int main()
{
    char s[1];
    float n1, n2;
    int x;

    printf("Escolha uma operação: (+, -, *, /) ");
    scanf("%s", s);
    printf("Digite N1: ");
    scanf("%f", &n1);
    printf("Digite N2: ");
    scanf("%f", &n2);

    if (strcmp(s, "+") == 0){
        printf("A soma é igual a %.2f", n1 + n2);
    }
    else if (strcmp(s, "-") == 0){
        printf("A subtração é igual a %.2f", n1 - n2);
    }
    else if (strcmp(s, "/") == 0){
        printf("A divisão é igual a %.2f", n1 / n2);
    }
    else if (strcmp(s, "*") == 0){
        printf("A multiplicação é igual a %.2f", n1 * n2);
    }
    else{
        printf("Operação inválida.");
    }
}