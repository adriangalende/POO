def score_pair(*dices):
    dadosOrdenados = sorted(dices)
    return dadosOrdenados[-1] + dadosOrdenados[-2]

print(score_pair(6,5,4,6,2))
