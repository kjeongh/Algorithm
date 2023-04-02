def solution(n, arr1, arr2):
    answer = []
    
    # 각 배열의 원소를 하나씩 꺼내어 or연산
    or_arr = [bin(arr1[i] | arr2[i])[2:].zfill(n) for i in range(n)]
    print(or_arr)
    
    # 1인 부분은 #, 0인 부분은 공백으로 변환하기
    for i in or_arr:
        answer.append(i.replace('1','#').replace('0',' '))

    return answer