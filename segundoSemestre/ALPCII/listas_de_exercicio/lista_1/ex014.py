# 14) F.U.P que gere um número aleatório de 1 a 100 e peça ao
# usuário para adivinhar, dando dicas de "maior" ou "menor" até
# acertar.

from random import randint

sorteio = randint(1, 100)
print("Sorteei um número de 0 a 100. Tente descobrir! ")

resp = 101

while resp != sorteio:
    resp = int(input("Seu palpite: "))
    if resp < sorteio:
        print("Maior!")
    elif resp > sorteio:
        print("Menor!")
    elif resp == sorteio:
        print("Parabéns! Você acertou!")
