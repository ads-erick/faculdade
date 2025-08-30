# 2 – F.U.P que receba uma lista de números. (Primeiramente faça uma lista) O
# Programa deverá retornar o maior número da lista. Podem ser 5 números. Use
# uma estrutura de repetição para percorrer os elementos

numeros = []
maior = 0

for c in range (5):
    num = int(input(f"Insira o {c+1}° número da lista: "))
    numeros.append(num)
    if c == 0:
        maior = num
    elif num > maior:
        maior = num

print(f"O maior número da lista {numeros} é o {maior}")
