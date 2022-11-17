import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.bson.Document;
public class insert
{
    public static void main(String args[])
    {
        MongoClient mongo =new MongoClient("Localhost",27017);
        System.out.println("Connect to the databace successfully");
        MongoDatabase database=mongo.getDatabase("TYIT");
        MongoCollection<Document>collection=database.getCollection("TY");
        System.out.println("Collection sumpleCollection selected successfully");
        Document document =new Document();
        document.append("id",1);
        document.append("description","database");
        document.append("likes",100);
        document.append("by","NOSQL");
        collection.insertOne(document);
        System.out.println("Document inserted  successfully");
    }
}