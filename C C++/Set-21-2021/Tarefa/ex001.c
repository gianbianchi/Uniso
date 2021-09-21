#include <stdio.h>

int main()
{
    int i = 0;
    float nota = 0, soma = 0, media;

    while (nota >= 0)
    {
        printf("Digite a %dª nota: ", i + 1);
        scanf("%f", &nota);
        if (nota >= 0){
            soma = soma + nota;
            i++;
        }
    }
    media = soma / i;
    printf("\nA média das %d notas é %.2f", i, media);
}