n1 = float(input("Digite a primeira nota do aluno: "))
n2 = float(input("Digite a segunda nota do aluno: "))
m = (n1+n2)/2

if (m >= 5):
    print("\nO aluno está aprovado!")
    print("A média foi {}".format(m))
else:
    print("\nO aluno está reprovado.")
    print("A média foi {}".format(m))
