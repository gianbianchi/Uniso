#Faça um programa que calcule o os clientes mais altos e baixos.
#Mais leves e mais pesados de uma academia.

menorPeso = 9999
menorAltura = 9999

maiorPeso = 0
maiorAltura = 0

codigo = 1
while (codigo != 0):
    codigo = input("\nCódigo do cliente: ")
    if(codigo == 0 or codigo == "0"):
        break
    peso = float(input("Qual o peso do cliente {}? ".format(codigo)))
    altura = float(input("Qual a altura do cliente {}? ".format(codigo)))
    
    if(peso > maiorPeso):
        maiorPeso = peso
        maiorPesoCliente = codigo
    if(altura > maiorAltura):
        maiorAltura = altura
        maiorAlturaCliente = codigo
    if(peso < menorPeso):
        menorPeso = peso
        menorPesoCliente = codigo
    if(altura < menorAltura):
        menorAltura = altura
        menorAlturaCliente = codigo

print("\nO cliente {} é o mais pesado: {}Kg".format(maiorPesoCliente, maiorPeso))
print("O cliente {} é o mais leve: {}Kg".format(menorPesoCliente, menorPeso))
print("O cliente {} é o mais alto: {}m".format(maiorAlturaCliente, maiorAltura))
print("O cliente {} é o mais baixo: {}m".format(menorAlturaCliente, menorAltura))
