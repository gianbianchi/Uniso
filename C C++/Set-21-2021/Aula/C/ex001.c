/*
    Esse programa é feito para calcular a soma de n alunos
    E a média das idades
*/


#include <stdio.h>

int main()
{
    int alunos, idade, soma, i;
    float media;
    printf("Digite a quantidade de alunos: ");
    scanf("%d", &alunos);
    
    soma = 0;
    
    for (i=0; i<alunos; i++ )
    {
        printf("Digite a idade do %d° aluno: ", i + 1);
        scanf("%d", &idade);
        soma = soma + idade;
    }
    media = soma / alunos;
    printf("A soma das idades dos %d alunos é %d", alunos, soma);
    printf("\nA média das idades é %.1f", media);
}