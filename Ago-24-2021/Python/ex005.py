nome = input("Qual o nome do aluno? ")
n1 = float(input("Qual a primeira nota? "))
n2 = float(input("Qual a segunda nota? "))
n3 = float(input("Qual a terceira nota? "))

media = (n1 + n2 + n3)/3
print("\nO aluno {} conseguiu uma média de {}\n".format(nome, media))
