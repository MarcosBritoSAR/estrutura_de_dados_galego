

def binary_search(arr, n):

    # 1. Rebo um array e um valor target
    # 2. Divido ao array e 2
    # 3. Verifico se o valor do meio está o meu valor, caso não, eu passo para o item 4. Caso sim eu retorno n
    # 4. Verifico em quais dos 2 lados provavelmente está o target
    # 5. Se está a direita, eu pego o pedaco do vetor, do meio até o fim, o transformo em um novo vetor e volto para o passo 2
    # 6. Se está a esquerda, eu pego o pedaco do vetor, do inicio até o ate o meio, o transformo em um novo vetor e volto para o passo 2

    e = 0
    d = len(arr) -1
    passos = 0

    while(e <= d):

        ponteiro = int(((e + d) / 2))
        passos = passos + 1
        print("Passo - ", passos)
        
        if(arr[ponteiro] == n):
            return ponteiro

        if(arr[ponteiro] > n):
            d = ponteiro - 1
        else:
            e = ponteiro + 1

    return -1

arr1 = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]

print(binary_search(arr1, 3))
