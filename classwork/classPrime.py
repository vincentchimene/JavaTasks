def isPrime(number):
    if (number == 1):
        return False
    mid = int (number/2 + 1)
    for count in range(2,mid):       
        if (number % count == 0):
            return False
    return True

print(isPrime(41))



#python3 -m unittest testfilename
