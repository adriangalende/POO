class Yatzy:

    def __init__(self, *dice):
        self.dice = list(dice)

    @staticmethod
    ''' Chance
        WHO: El usuario/la usuaria
        WHAT: Sumar el total de cada uno de los dados
        WHY:
        details:
    '''   
    def chance(*dice):
        score = 0
        for die in dice:
            score += die
        return score

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Comprobar que todos los dados son iguales
        WHY: Conseguir 50 puntos
        details: Si todos los dados = 50 puntos, si no 0
    '''
    def yatzy(*dice):
        if dice.count(dice[0]) != 5:
            return 0
        return 50

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Sumar los UNOS de los dados
        WHY:
        details:
    '''
    def ones(*dice):
        ONE = 1
        return dice.count(ONE) * ONE

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Sumar los DOS de los dados
        WHY:
        details:
    '''
    def twos(*dice):
        TWO = 2
        return dice.count(TWO) * TWO

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Sumar los TRES de los dados
        WHY:
        details:
    '''
    def threes(*dice):
        THREE = 3
        return dice.count(THREE) * THREE

    '''
        WHO: El usuario/la usuaria
        WHAT: Sumar los CUATROS de los dados
        WHY:
        details:
    '''
    def fours(self):
        FOUR = 4
        return self.dice.count(FOUR) * FOUR

    '''
        WHO: El usuario/la usuaria
        WHAT: Sumar los CINCOS de los dados
        WHY:
        details:
    '''
    def fives(self):
        FIVE = 5
        return self.dice.count(FIVE) * FIVE

    '''
        WHO: El usuario/la usuaria
        WHAT: Sumar los SEISES de los dados
        WHY:
        details:
    '''
    def sixes(self):
        SIX = 6
        return self.dice.count(SIX) * SIX

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Comprobar que dos dados son iguales
        WHY: Sumar la cantidad a la puntuación
        details: Seleccionar la pareja de mayor valor!
    '''
    def pair(*dice):
        PAIR = 2
        for numero in range(6, 0, -1):
            if dice.count(numero) >= PAIR:
                return PAIR * numero
        return 0

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Comprobar que hay dos parejas iguales
        WHY: Sumar el total de ambas parejas
        details: dos dados iguales y, a la vez distintos de los otros dos dados, que
                también deben ser iguales entre sí
    '''
    def two_pairs(*dice):
        PAIR = 2
        pairs = 0
        score = 0
        numero = 1
        while pairs < 2 and numero <= 6:
            if dice.count(numero) >= 2:
                pairs += 1
                score += PAIR * numero
            numero += 1
        if pairs == 2:
            return score
        else:
            return 0

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Comprobar que hay tres dados iguales
        WHY: Sumar el total de los tres dados que son iguales
        details:
    '''
    def three_of_a_kind(*dice):
        THREE = 3
        for numero in range(6, 0, -1):
            if dice.count(numero) >= THREE:
                return THREE * numero
        return 0

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Comprobar si hay cuatro dados iguales
        WHY: Sumar la cantidad de los cuatro dados iguales
        details:
    '''
    def four_of_a_kind(*dice):
        FOUR = 4
        for numero in range(6, 0, -1):
            if dice.count(numero) >= FOUR:
                return FOUR * numero
        return 0

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Comprobar que hay 5 dados con números sucesivos (1-5)
        WHY: Sumar 15 puntos a su puntuación
        details:
    '''
    def small_straight(*dice):
        for numero in range(1, 6):
            if dice.count(numero) != 1:
                return 0
        return Yatzy.chance(*dice)

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Comprobar que hay 5 dados con números sucesivos (2-6)
        WHY: Sumar 20 puntos a su puntuación
        details:
    '''
    def large_straight(*dice):
        for numero in range(2, 7):
            if dice.count(numero) != 1:
                return 0
        return Yatzy.chance(*dice)

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Comprobar que hay 3 dados iguales y una pareja, distinta a los 3 dados
        WHY: Suma del trio y la pareja
        details:
    '''
    def fullHouse(*dice):
        if Yatzy.__par_bajo(*dice) and Yatzy.three_of_a_kind(*dice):
            return Yatzy.__par_bajo(*dice) + Yatzy.three_of_a_kind(*dice)
        else:
            return 0

    @staticmethod
    '''
        WHO: El usuario/la usuaria
        WHAT: Comprobar que hay DOS dados iguales
        WHY: Sumar el total de los dados iguales
        details:
    '''
    def __par_bajo(*dice):
        PAIR = 2
        for numero in range(6, 0, -1):
            if dice.count(numero) == PAIR:
                return PAIR * numero
        return 0
