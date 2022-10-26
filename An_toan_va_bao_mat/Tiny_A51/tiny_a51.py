import random 
# sinh so ngau nhien
def random_number(a):
    arr = []
    for i in range(0,a):
        arr.append(str(random.randint(0,1)))
    return arr
    
def XOR(X, Y):
    if (int(X) == int(Y)):
        return 0
    return 1

def maj(X,Y,Z):
    tong = int(X) + int(Y) + int(Z)
    if tong <= 1:
        return 0
    else:
        return 1
def XOR_arr(X,Y):
    s = []
    for i in range(0,len(X)):
        s.append(XOR(X[i],Y[i]))
    return s

def rotate_X(X):
    t = XOR(XOR(X[2], X[4]),X[5])
    rotate_X = [str(t)]
    for i in range(0,5):
        rotate_X.append(X[i])
    return rotate_X

def rotate_Y(Y):
    t = XOR(Y[6], Y[7])
    rotate_Y = [str(t)]
    for i in range(0,8):
        rotate_Y.append(Y[i])
    return rotate_Y

def rotate_Z(Z):
    t = XOR(XOR(Z[2],Z[7]),Z[8])
    rotate_Z = [str(t)]
    for i in range(0,9):
        rotate_Z.append(Z[i])
    return rotate_Z
def Sinh_si(X, Y, Z):
    m = maj(X[1], Y[3], Z[3])
    if m == int(X[1]):
        X = rotate_X(X)
    if m == int(Y[3]):
        Y = rotate_Y(Y)
    if m == int(Z[3]):
        Z = rotate_Z(Z)
    return X, Y, Z
def arr_to_str(arr):
    s = ''
    for i in range(0, len(arr)):
        s += str(arr[i])
    return s
def key_K(num):
    Z = ['1','0','0','1','1','0','0','0','0','0']
    Y = ['1','0','1','0','0','1','1','1','0']
    X = ['1','0','0','1','0','1']
    print ("k=", arr_to_str(X),arr_to_str(Y),arr_to_str(Z))
    K = []
    for i in range(0,num):
        X,Y,Z = Sinh_si(X,Y,Z)
        si = XOR(X[5],XOR(Y[7],Z[8]))
        K.append(si)
    return K
def ma_hoa(p):
    K = key_K(len(p))
    c = XOR_arr(p,K)
    return c
print(ma_hoa([1,1,1]))
    
    















