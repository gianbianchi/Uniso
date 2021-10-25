#Faça um Programa que leia um vetor de 5 números inteiros e mostre-os

n = []
i = 0

while i < 5:
    n.append(int(input("Qual o {}º valor? ".format(i + 1))))
    i = i + 1
print(n)
