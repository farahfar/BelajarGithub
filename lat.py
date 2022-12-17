print ("====================================KALKULATOR RUMUS BALOK====================================")

while True:
    
    #rumus yang dicari user
    rumus = str (input("rumus apa yang anda cari?? (volume, keliling, luas permukaan, tinggi, lebar, panjang) = "))

    def volume(p,l,t):
        V = p*l*t
        return V

    def keliling(p,l,t):
        k = 4 * (p + l + t)
        return k
  
    def luas_permukaan(p,l,t):
        L = 2 * ((p*l) + (p*t) + (l*t))
        return L    

    def tinggi(V,p,l):
        t = V / (p*l)
        return t

    def lebar(V,p,t):
        l = V / (p*t)
        return l

    def panjang(V,l,t):
        p = V / (l*t)
        return p
        
    #volume
    if rumus == "volume":
        p = float (input("p = ")); 
        l = float (input("l = ")); 
        t = float (input("t = ")); 
        volume(p,l,t)
        print ("Volume\t= p x l x t\n\t= {} x {} x {}\n\t= {}".format(p,l,t, volume(p,l,t)))
    
    #keliling
    if rumus == "keliling":
        p = float (input("p = ")); 
        l = float (input("l = ")); 
        t = float (input("t = ")); 
        keliling(p,l,t)
        print ("keliling\t= p x l x t\n\t= {} x {} x {}\n\t= {}".format(p,l,t, keliling(p,l,t)))

    #luas permukaan
    if rumus == "luas permukaan":
        p = float (input("p = ")); 
        l = float (input("l = ")); 
        t = float (input("t = ")); 
        luas_permukaan(p,l,t)
        print ("Luas Permukaan\t= p x l x t\n\t= {} x {} x {}\n\t= {}".format(p,l,t, luas_permukaan(p,l,t)))
   
   #tinggi
    if rumus == "tinggi":
        V = float (input("V = ")); 
        p = float (input("p = ")); 
        l = float (input("l = ")); 
        tinggi(V,p,l)
        print("tinggi\t= p x l x t\n\t= {} x {} x {}\n\t= {}".format(V,p,l, tinggi(V,p,l)))
           
    #panjang
    if rumus == "panjang":
        V = float (input("V = ")); 
        l = float (input("l = ")); 
        t = float (input("t = ")); 
        panjang(V,l,t)
        print("panjang\t= p x l x t\n\t= {} x {} x {}\n\t= {}".format(V,l,t, panjang(V,l,t)))
            
    #lebar
    if rumus == "lebar":
        V = float (input("V = ")); 
        p = float (input("p = "));
        t = float (input("t = "));
        lebar(V,p,t)
        print("lebar\t= p x l x t\n\t= {} x {} x {}\n\t= {}".format(V,p,t, lebar(V,p,l)))
        
    #pengulangan
    print("")
    print ("ingin mengulang? (ya/tidak): ")
    ulang = str (input("= "))
    
    if ulang == "y":
        continue
    
    else:
        print ("")
        print ("===============================================================================================")
        print ("")
    
        print ("                           Proses kamu sudah selesai, terimakasih :)")
        print ("")
        print ("===============================================================================================")
        
    break