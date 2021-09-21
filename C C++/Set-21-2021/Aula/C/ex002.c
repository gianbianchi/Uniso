/*
    Calcular a média de 5 notas de um aluno
    Exibir se ele está aprovado (media >= 6)
    Se ele está em recuperação (3 >= media < 6)
    Se ele está reprovado (media < 3)
*/

#include <stdio.h>

int main()
{
    int i;
    float media, nota, soma;

    soma = 0;
    
    for (i=0; i<5; i++ )
    {
        printf("Digite a %dº nota do aluno: ", i + 1);
        scanf("%f", &nota);
        soma = soma + nota;
    }
    media = soma / 5;
    if (media >= 6){
        printf("\nAluno aprovado com média %.2f", media);
    }
    else if (media >= 3 && media < 6){
        printf("\nAluno em recuperação com média %.2f", media);
    }
    else{
        printf("\nAluno reprovado com média %.2f", media);
    }
}