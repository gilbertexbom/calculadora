# Calculadora Simples
import matematica

while True:
    # Apresentação
    print('\n\t\t\t -- Calculadora --\n')

    # Menu
    print('1. Soma')
    print('2. Sair')

    # Opção informada pelo usuário
    op = int(input('\nOpção: '))

    if op == 1:
        # Entradas
        n1 = int(input('Informe n1: '))
        n2 = int(input('Informe n2: '))

        # Processamento
        # total = n1 + n2 Obsoleto
        total = matematica.soma(n1, n2)

        # Saída
        print(f'\n{n1} + {n2} = {total}')
    elif op == 2:
        print('\nSaindo....')
        break
    else:
        print(f'\nOpção {op} incorreta!')

