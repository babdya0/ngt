from pymongo import MongoClient
client=MongoClient("localhost", 27017) 
db=client.TY 
def delete(): 
    try:
        name=input("Enter the name : ") 
        db.Stu.delete_one(
            { "name":name }, 
        )
        print ("Data Deleted  successfully") 
    except Exception as e:
        print (str(e)) 
delete() 
