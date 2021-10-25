#Faça um Programa que receba a temperatura média de cada
#mês do ano e armazene-as em uma lista. Após isto, calcule 
#a média anual das temperaturas e mostre todas as temperaturas 
#acima da média anual e em que mês ocorreram (por extenso)

meses = ["Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"]
tempMeses = []
tempMaior = []
soma = 0

i = 0
while i < 12:
    tempMeses.append(float(input("Temperatura média de {}? ".format(meses[i]))))
    soma = soma + tempMeses[i]
    i = i + 1

media = soma / 12
print("\nA media das temperaturas no ano é: {}°".format(media))

i = 0
for temp in tempMeses:
    if (temp > media):
        print("O mês de {} está acima da média, com temperatura de {}°".format(meses[i], temp))
    i = i + 1
