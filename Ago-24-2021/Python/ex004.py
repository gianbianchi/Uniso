nome = input("Qual o nome do vendedor? ")
salario = float(input("Qual o salário? "))
venda = float(input("Qual o total em vendas? "))

total = salario + (venda * 0.15)

print("\nO vendedor {} vai receber {}".format(nome, total))
print("Sendo que o salário fixo é {} e a comissão será {}".format(salario, venda * 0.15))
