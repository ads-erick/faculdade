# 10) F.U.P que peça o valor de uma compra e aplique um desconto
# de 10% se for acima de R$ 100,00.

valor = float(input("Insira o valor da compra: R$ "))

desc = valor - (valor*0.10)

if valor > 100:
    print(f"O valor da compra com desconto de 10% fica: R${desc:.2f}")
else:
    print(f"O valor da compra fica em: R${valor:.2f}")
