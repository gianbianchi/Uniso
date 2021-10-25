#Faça um programa que calcule o fatorial de um número.

n = int(input("Digite um inteiro: "))

fatorial = 1
h = n

i = 0
while i < n:
    fatorial = fatorial * h
    i = i + 1
    h = h - 1 

print(fatorial)
