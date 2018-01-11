class Yatzy:
    def __init__(self, d1, d2, d3, d4, _5):
        self.dice = [0]*5
        self.dice[0] = d1
        self.dice[1] = d2
        self.dice[2] = d3
        self.dice[3] = d4
        self.dice[4] = _5


    def sumaDadosSimples(numero, *dices):
        score = 0
        for dice in dices:
            if dice == numero:
                score += numero
        return score


    @staticmethod
    def chance(*dices):
        # assert len(args) == 5
        score = 0
        for dice in dices:
            score += dice
        return score


    @staticmethod
    def yatzy(*dice):
        if len(set(dice)) == 1:
            return 50
        return 0


    @staticmethod
    def ones(*dices):
        return Yatzy.sumaDadosSimples(1, *dices)


    @staticmethod
    def twos(*dices):
        return Yatzy.sumaDadosSimples(2, *dices)


    @staticmethod
    def threes(*dices):
        return Yatzy.sumaDadosSimples(3, *dices)


    def fours(*dices):
        return Yatzy.sumaDadosSimples(4, *dices)


    def fives(*dices):
        return Yatzy.sumaDadosSimples(5, *dices)


    def sixes(*dices):
        return Yatzy.sumaDadosSimples(6, *dices)

    @staticmethod
    def score_pair(*dices):
        dadosOrdenados = sorted(dices)
        return dadosOrdenados[-1] + dadosOrdenados[-2]


    @staticmethod
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


    @staticmethod
    def three_of_a_kind( d1,  d2,  d3,  d4,  d5):
        t = [0]*6
        t[d1-1] += 1
        t[d2-1] += 1
        t[d3-1] += 1
        t[d4-1] += 1
        t[d5-1] += 1
        for i in range(6):
            if (t[i] >= 3):
                return (i+1) * 3
                return 0


    @staticmethod
    def four_of_a_kind(*dices):
        score = 0
        for dice in dices:
            if dices.count(dice) >= 4:
                score = dice * 4
        return score


    @staticmethod
    def smallStraight( d1,  d2,  d3,  d4,  d5):
        tallies = [0]*6
        tallies[d1-1] += 1
        tallies[d2-1] += 1
        tallies[d3-1] += 1
        tallies[d4-1] += 1
        tallies[d5-1] += 1
        if (tallies[0] == 1 and
            tallies[1] == 1 and
            tallies[2] == 1 and
            tallies[3] == 1 and
            tallies[4] == 1):
            return 15
        return 0


    @staticmethod
    def largeStraight( d1,  d2,  d3,  d4,  d5):
        tallies = [0]*6
        tallies[d1-1] += 1
        tallies[d2-1] += 1
        tallies[d3-1] += 1
        tallies[d4-1] += 1
        tallies[d5-1] += 1
        if (tallies[1] == 1 and
            tallies[2] == 1 and
            tallies[3] == 1 and
            tallies[4] == 1
            and tallies[5] == 1):
            return 20
        return 0


    @staticmethod
    def fullHouse( d1,  d2,  d3,  d4,  d5):
        tallies = []
        _2 = False
        i = 0
        _2_at = 0
        _3 = False
        _3_at = 0

        tallies = [0]*6
        tallies[d1-1] += 1
        tallies[d2-1] += 1
        tallies[d3-1] += 1
        tallies[d4-1] += 1
        tallies[d5-1] += 1

        for i in range(6):
            if (tallies[i] == 2):
                _2 = True
                _2_at = i+1


        for i in range(6):
            if (tallies[i] == 3):
                _3 = True
                _3_at = i+1


        if (_2 and _3):
            return _2_at * 2 + _3_at * 3
        else:
            return 0
