#include<stdio.h>

int main()
{
    int n1,n2,r1,r2;
    printf("Digite n1: ");
    scanf("%d", &n1);
    printf("Digite n2: ");
    scanf("%d", &n2);

    if (n2 == 0){
        printf("Nao e possivel dividir por zero");
    }

    if (n1 % 3 == 0 && n1 % 5 == 0){
        printf("O número %d é divisível por 3 e 5\n", n1);
    }
    else{
        printf("O número %d não é divisível por 3 e 5 ao mesmo tempo\n", n1);
    }
    if (n2 % 3 == 0 && n2 % 5 == 0){
        printf("O número %d é divisível por 3 e 5\n", n2);
    }
    else{
        printf("O número %d não é divisível por 3 e 5 ao mesmo tempo\n", n2);

    if (n1 > 0){
        printf("O número n1 = %d é positivo", n1);
        if (n1 % 4 == 0){
            printf(" e múltiplo de 4");
        }
        else{}
    }
    else if (n1 < 0){
        printf("\nO número n1 = %d é negativo", n1);
        if (n1 % 4 == 0){
            printf(" e múltiplo de 4");
        }
        else{}
    }
    else{
        printf("\nO número n1 é zero", n1);
    }
    if (n2 > 0){
        printf("\nO número n2 = %d é positivo", n2);
        if (n2 % 4 == 0){
            printf(" e múltiplo de 4");
        }
        else{}
    }
    else if (n2 < 0){
        printf("\nO número n2 = %d é negativo", n2);
        if (n2 % 4 == 0){
            printf(" e múltiplo de 4");
        }
        else{}
    }
    else{
        printf("\nO número n1 é zero", n2);
    }
    }
}