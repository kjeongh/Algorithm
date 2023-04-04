def solution(angle):
    if 0<angle and 90>angle: return 1
    elif angle==90: return 2
    elif angle>90 and angle<180: return 3
    else: return 4
