# beecrowd | 2297
# Bafo

'''
Input:
- rodadas (integer): quantidade de R rodadas que ocorrem na partida.
- partidas (list): uma lista composta de R itens, onde cada item contém dois
interios positivos, A e B.

Output:
- string
'''

numero_teste = 1

while True:
    rodadas = int(input())
    if rodadas == 0:
        break

    pontos_totais_aldo = 0
    pontos_totais_beto = 0

    for _ in range(rodadas):
        partida = input().split()
        pontos_aldo = int(partida[0])
        pontos_beto = int(partida[1])
        pontos_totais_aldo += pontos_aldo
        pontos_totais_beto += pontos_beto

    print(f'Teste {numero_teste}')
    if pontos_totais_aldo > pontos_totais_beto:
        print('Aldo\n')
    else:
        print('Beto\n')
    
    numero_teste += 1