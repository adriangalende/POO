def two_pair(*dices):
    numerosRepetidos = []
    for number in dices:
        if dices.count(number) > 1 and number not in numerosRepetidos:
            numerosRepetidos.append(number)

    if len(numerosRepetidos) == 2:
        score = sum(numerosRepetidos) * 2
    else:
        score = 0

    return score

print(two_pair(6,5,4,6,4))
