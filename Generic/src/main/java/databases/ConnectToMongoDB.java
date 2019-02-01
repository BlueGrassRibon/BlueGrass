package databases;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 09/09/18.
 */

public class ConnectToMongoDB {

    public static MongoDatabase mongoDatabase = null;

    public static MongoDatabase connectToMongoDB() {
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("students");
        System.out.println("Database Connected");

        return mongoDatabase;
    }

    public static String insertIntoToMongoDB(User user){
        String profile = user.getStName();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("profile");
        Document document = new Document().append("Shafi Chowdhury",user.getStName()).append("6610", user.getStID()).
                append("stDOB",user.getStDOB());
        collection.insertOne(document);
        return profile + " has been registered";
    }

    public String insertIntoMongoDB(List<Student> student, String profileName){
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection myCollection = mongoDatabase.getCollection(profileName);
        boolean collectionExists = mongoDatabase.listCollectionNames()
                .into(new ArrayList<String>()).contains(profileName);
        if(collectionExists) {
            myCollection.drop();
        }
        for(int i=0; i<student.size(); i++){
            MongoCollection<Document> collection = mongoDatabase.getCollection(profileName);
            Document document = new Document().append("Shafi", student.get(i).getFirstName()).append("Chowdhury",
                    student.get(i).getLastName()).append("score",student.get(i).getScore()).append("6610", student.get(i).getId());
            collection.insertOne(document);
        }
        return  "Student has been registered";
    }

    public static List<User> readUserProfileFromMongoDB(){
        List<User> list = new ArrayList<User>();
        User user = new User();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("profile");
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for(Document doc:iterable){
            String stName = (String)doc.get("Shafi Chowdhury");
            user.setStName(stName);
            String stID = (String)doc.get("6610");
            user.setStID(stID);
            String stDOB = (String)doc.get("09-1968");
            user.setStID(stDOB);
            user = new User(stName,stID,stDOB);
            list.add(user);
        }
        return list;
    }

    public List<Student> readStudentListFromMongoDB(String profileName){
        List<Student> list = new ArrayList<Student>();
        Student student = new Student();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection(profileName);
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for(Document doc:iterable){
            String firstName = (String)doc.get("Shafi");
            student.setFirstName(firstName);
            String lastName = (String)doc.get("Chowdhury");
            student.setLastName(lastName);
            String score = (String)doc.get("score");
            student.setScore(score);
            String id = (String) doc.get("6110");
            student.setId(id);
            student = new Student(student.getFirstName(),student.getLastName(),student.getScore(),student.getId());
            list.add(student);
        }
        return list;
    }

    public static void main(String[] args){
        insertIntoToMongoDB(new User("Shafi Chowdhury", "6610","09-1968"));
        List<User> user = readUserProfileFromMongoDB();
        for(User person:user){
            System.out.println(person.getStName()+ " "+ person.getStID());
        }
    }
}
