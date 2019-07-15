# Accepted
# 265 ms    7200 KB
# Jul/13/2018 17:14 UTC+8
num1 = input()
num2 = input()
num2 = num2.split(" ")

s = 0
m = 1000000001
for num in num2 :
    s = s + int(num)
    if (int(num) % 2 == 1) :
        m = min(m, int(num))

if (s % 2 == 1) :
    s = s - m

print(s)