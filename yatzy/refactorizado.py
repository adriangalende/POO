def placeholder(numero, *dices):
    score = 0
    for dice in dices:
        if dices.count(dice) >= numero:
            score = dice * numero

    return score



def test_three_of_a_kind():
    assert 8 == Yatzy.three_of_a_kind(2,2,2,2,1)
    assert 8 == Yatzy.three_of_a_kind(2,1,2,2,2)
