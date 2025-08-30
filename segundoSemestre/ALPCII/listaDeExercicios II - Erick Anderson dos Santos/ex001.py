# 1 – F.U.P que solicite ao usuário digitar números e armazene-os em uma lista.
# Pode ser 5 números. E depois pergunte ao usuário qual número deseja
# procurar e diga se ele está ou não na lista. Use if e else.

numeros = []

for c in range (5):
    num = int(input(f"Insira o {c+1}° número: "))
    numeros.append(num)

proc = int(input("Insira um número para ver se ele está na lista: "))
if proc in numeros:
    print(f"{proc} está na lista: {numeros}")
else:
    print(f"{proc} não está na lista: {numeros}")
