# Accepted
# 265 ms    8600 KB
# Jul/13/2018 17:56 UTC+8
i1 = input()
i2 = input().split(' ')

sum = 0
tmparr = []
for i in range(int(i1)):
    sum = sum + int(i2[i])
    tmparr.append(int(i2[i]))

if sum % 2 == 0:
    print(sum)
else:
    tmparr = sorted(tmparr)
    for i in range(int(i1)):
        if int(tmparr[i]) % 2 != 0:
            sum = sum - int(tmparr[i])
            print(sum)
            break