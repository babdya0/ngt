from pymongo import MongoClient
client = MongoClient("localhost", 27017) 
db = client.TY  
def update(): 
    try:
        db.Stu.update_one(
            {"id":"1"} , 
            {"$set":{"age": "25"}}
        )
        print ("Data inserted successfully") 
    except Exception as e:
        print (str(e)) 
update() 
