#include<stdio.h>

int i = 0;
float resultado = 0.0;

void main (void)
{
    for(i=0; i<10; i++)
    {
        resultado += 0.1;
    }
    printf("\nO resultado eh: %0.8f", resultado);
}