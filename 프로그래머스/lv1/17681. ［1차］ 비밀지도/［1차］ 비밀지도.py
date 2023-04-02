def solution(n, arr1, arr2):
    answer = []
    
    # 각 배열의 원소를 하나씩 꺼내어 or연산
    or_arr = [bin(arr1[i] | arr2[i])[2:].zfill(n) for i in range(n)]
    
    # 1인 부분은 #, 0인 부분은 공백으로 변환하기
    for i in range(n):
        map = ""
        for j in range(n):
            c = or_arr[i][j]
            print(c)
            if c == '1':
                map = map + '#'
            else:
                map = map + ' '
        answer.append(map)
    

    return answer