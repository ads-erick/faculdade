# 4 – F.U.P que leia números até que o usuário digite 0. Armazene os números
# em uma lista e, ao final, mostre a soma total.

lista = []

while True:
    num = int(input("Insira um número: "))
    if num == 0:
        break
    else:
        lista.append(num)

print(f"A soma total dos números é {sum(lista)}")
