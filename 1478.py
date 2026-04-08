# beecrowd | 1478
# Square Matrix II

def squreMatrix(n):

    if n == 0:  # input 0
        print('  ')
        print()
    elif n == 1:  # input 1
        print('  1')
        print()
    elif n > 1:  # input > 1
        matrix = []

        # cria linhas
        for i in range(1, n + 1):  
            new_line = []
            
            # excluindo a primeira linha, todas as linhas tem as células diminuídas pelo index da coluna
            q = i

            # se é a primeira linha, as células aumentão em 1
            if q == 1:
                for j in range(n):
                    new_line.append(j + 1)
            
            # nas outras linhas, as células diminuem em 1
            # até que o valor de uma célula seja igual a 1
            else:
                # uma variável contadora é usada para registrar o número de células que faltam
                counter = n
                while q > 1:
                    new_line.append(q)
                    q -= 1
                    counter -= 1
                
                # quanto uma célula fica igual a 1, as próximas células restantes aumentam em 1
                if q == 1:
                    for j in range(counter):
                        new_line.append(j + 1)

            matrix.append(new_line)

        output = ''
        for row in matrix:
            column = 0
            for cell in row:
                if column == 0:
                    output += '{:>3}'.format(cell)
                    column += 1
                else:
                    output += ' {:>3}'.format(cell)
            output += '\n'

        print(output)


for i in range(100):
    n = int(input())
    squreMatrix(n)