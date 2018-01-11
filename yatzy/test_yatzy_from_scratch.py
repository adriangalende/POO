import pytest
from yatzy import Yatzy

# Chance
# The player scores the sum of all dice, no matter what they read.


def test_chance():
    # iterar sobre *args evita codigo cableado a 5 argumentos
    assert 15 == Yatzy.chance(1, 2, 3, 4, 5)
    assert 14 == Yatzy.chance(1, 1, 3, 3, 6)
    assert 21 == Yatzy.chance(4, 5, 5, 6, 1)

def test_yatzy():
    assert 50 == Yatzy.yatzy(1, 1, 1, 1, 1)
    assert 0 == Yatzy.yatzy(1,1,2,2,3)

def test_ones():
    assert 5 == Yatzy.ones(1,1,1,1,1)
    assert 3 == Yatzy.ones(1,2,3,5,6,9,8,2,3,6,1,1)

def test_score_pair():
    assert 12 == Yatzy.score_pair(1,6,1,6,6)
    assert 0 == Yatzy.score_pair(5,1,2,6,9)

def test_two_pair():
    assert 8 == Yatzy.two_pair(1,1,2,3,3)
    assert 0 == Yatzy.two_pair(1,1,2,3,4)
    assert 0 == Yatzy.two_pair(1,1,2,2,3,3)

def test_four_of_a_kind():
    assert 8 == Yatzy.four_of_a_kind(2,2,2,2,1)
    assert 8 == Yatzy.four_of_a_kind(2,1,2,2,2)
