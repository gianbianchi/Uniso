/*
    Programa para N eleitores votarem em 3 candidatos.
*/
#include <stdio.h>

int main()
{
    int nEleitores, n1=0, n2=0, n3=0, i, voto;
    
    printf("Qual o número total de eleitores? ");
    scanf("%d", &nEleitores);
    
    for (i=0; i<nEleitores; i++){
        printf("Para qual candidato o %d° eleitor vota?\nDigite 1, 2, ou 3: ", i + 1);
        scanf("%d", &voto);
        if (voto == 1){
            n1++;
        }
        else if (voto == 2){
            n2++;
        }
        else if (voto == 3){
            n3++;
        }
        else{
            printf("\nNúmero inválido, digite novamente.\n");
            i--;
        }
    }
    printf("\nO primeiro candidato conseguiu %d votos", n1);
    printf("\nO segundo candidato conseguiu %d votos", n2);
    printf("\nO terceiro candidato conseguiu %d votos", n3);
}
