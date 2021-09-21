operacao = input("Escolha uma operação: (+, -, *, /) ")
n1 = float(input("Número 1: "))
n2 = float(input("Número 2: "))

if(operacao == "/"):
    print("O resultado é:",n1/n2)
elif(operacao == "*"):
    print("O resultado é:",n1*n2)
elif(operacao=="+"):
    print("O resultado é:",n1+n2)
elif(operacao=="-"):
    print("O resultado é:",n1-n2)
else:
    print("Operação inválida.")
