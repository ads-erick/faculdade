# 11) F.U.P que peça um número e exiba a tabuada de 1 a 10 desse
# número.

num = int(input("Insira um número para ver sua tabuada: "))

for c in range(1, 11):
    print(f"{num} x {c} = {num*c}")
