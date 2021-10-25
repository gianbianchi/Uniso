#Faça um programa que peça 10 números inteiros, 
#calcule e mostre a quantidade de números pares e a quantidade de números impares.
par = []
impar = []

i = 0
while i < 10:
    n = int(input("Digite o {}º número: ".format(i + 1)))
    if(n%2 == 0):
        par.append(n)
    else:
        impar.append(n)
    i = i + 1

print("\nForam {} números pares, sendo eles: ".format(len(par)))
print(par)
print("\nForam {} números ímpares, sendo eles: ".format(len(impar)))
print(impar)
