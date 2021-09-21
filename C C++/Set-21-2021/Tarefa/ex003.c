/*
    Dados quatro números distintos, desenvolver um algoritmo que determine e imprima a soma dos três menores.
*/

#include <stdio.h>

int main()
{
    float n1, n2, n3, n4, soma = 0;

    printf("Digite o 1° valor: ");
    scanf("%f", &n1);
    printf("Digite o 2° valor: ");
    scanf("%f", &n2);
    printf("Digite o 3° valor: ");
    scanf("%f", &n3);
    printf("Digite o 4° valor: ");
    scanf("%f", &n4);

    if (n1 >= n2 && n1 >= n3 && n1 >= n4){
        soma = n2 + n3 + n4;
        printf("n1 é maior\n");
    }
    else if (n2 >= n1 && n2 >= n3 && n2 >= n4){
        soma = n1 + n3 + n4;
        printf("n2 é maior\n");
    }
    else if (n3 >= n1 && n3 >= n2 && n3 >= n4){
        soma = n1 + n2 + n4;
        printf("n3 é maior\n");
    }
    else{
        soma = n1 + n2 + n3;
        printf("n4 é maior\n");
    }

    printf("A soma dos três menores números é igual a %.2f", soma);
}