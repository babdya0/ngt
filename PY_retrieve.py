from pymongo import MongoClient
client = MongoClient("localhost", 27017) 
db = client.TY 

def rd(): 
    try:
        read = db.Stu.find()
        print ("Data Read  successfully") 
        for data in read:
            print(data)
    except Exception as e:
        print (str(e)) 
rd() 
