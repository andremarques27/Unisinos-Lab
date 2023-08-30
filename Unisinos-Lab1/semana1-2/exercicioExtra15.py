salario1 = float(input("Digite o primero salário: "))
salario2 = float(input("Digite o segundo salário: "))
despesa = float(input("Digite o valor das despesas: "))

if salario1 > salario2:
    print(f"Salario 1 paga: R${despesa * 0.65:.2f} \n"
          f"Salario 2 paga: R${despesa * 0.35:.2f}")

else:
    print(f"Salario 1 paga: R${despesa * 0.35:.2f} \n"
          f"Salario 2 paga: R${despesa * 0.65:.2f}")