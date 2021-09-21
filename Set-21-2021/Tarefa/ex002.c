/*
    Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
*/

#include <stdio.h>

int main()
{
    int nPessoas, i, idade, soma = 0;
    float media;

    printf("Quantas pessoas serão contadas? ");
    scanf("%d", &nPessoas);

    for (i=0; i < nPessoas; i++){
        printf("Qual é a idade da %dª pessoa? ", i + 1);
        scanf("%d", &idade);
        if (idade >= 0){
            soma = soma + idade;
        }
        else{
            printf("\nValor inválido, digite novamente\n");
            i--;
        }
    }
    media = soma / nPessoas;
    if (media >= 0 && media < 25){
        printf("\nCom média de %.2f, a turma é jovem.", media);
    }
    else if (media >= 25 && media < 60){
        printf("\nCom média de %.2f, a turma é adulta", media);
    }
    else{
        printf("\nCom média de %.2f, a turma é idosa", media);
    }
}