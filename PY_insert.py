from pymongo import MongoClient
client = MongoClient("localhost", 27017) 
db = client.TY
def insert(): 
    try:
        id="1"
        name="sample"
        age="20"
        roll="123456"
        db.Stu.insert_one({
            "id": id ,
            "name": name ,
            "age": age ,
            "roll": roll
        })
        print ("Data inserted successfully") 

    except Exception as e:
        print (str(e)) 

insert() 
