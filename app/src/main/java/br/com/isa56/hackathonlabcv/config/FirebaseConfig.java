package br.com.isa56.hackathonlabcv.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseConfig {

    private static DatabaseReference db;
    private static FirebaseAuth auth;

    public static DatabaseReference getFirebaseDatabase(){

        if(db == null){
            db = FirebaseDatabase.getInstance().getReference();
        }
        return db;
    }

    public static FirebaseAuth getFirebaseAuth(){

        if(auth == null){
            auth = FirebaseAuth.getInstance();
        }

        return auth;
    }

}
