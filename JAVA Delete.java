import com.mongodb.client.model.Filters;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.bson.Document;
public class Delete
{
    public static void main(String args[])
    {
        MongoClient mongo=new MongoClient("localhost",27017);
        System.out.println("Connected to the db successfully");
        MongoDatabase database=mongo.getDatabase("TYIT");
        MongoCollection<Document> collection=database.getCollection("TY");
        System.out.println("Collection Selected");
        //DELETING the documents
        collection.deleteOne(Filters.eq("id",1));
        System.out.println("Document Deleted");
    }
}