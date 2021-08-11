package br.com.isa56.hackathonlabcv.helper;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import br.com.isa56.hackathonlabcv.activity.admin.MenuAdminActivity;
import br.com.isa56.hackathonlabcv.activity.collector.MenuCollectorActivity;
import br.com.isa56.hackathonlabcv.activity.patient.MenuPatientActivity;
import br.com.isa56.hackathonlabcv.config.FirebaseConfig;
import br.com.isa56.hackathonlabcv.model.User;

public class FirebaseUserHelper {

    public static FirebaseUser getCurrentFbUser(){
        FirebaseAuth user = FirebaseConfig.getFirebaseAuth();
        return user.getCurrentUser();
    }

    public static boolean updateUserName(String name){

        try {
            FirebaseUser user = getCurrentFbUser();
            UserProfileChangeRequest profile = new UserProfileChangeRequest.Builder().setDisplayName(name).build();
            user.updateProfile(profile).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(!task.isSuccessful()){
                        Log.d("Perfil", "Erro ao atualizar nome de perfil");
                    }
                }
            });
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static void RedirectLoggedUser(Activity activity) {


        DatabaseReference usersRef = FirebaseConfig.getFirebaseDatabase().child("users").child(getUserID());
        usersRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User user = snapshot.getValue(User.class);
                String userType = user.getType();
                if (userType.equals("P")) {  // Paciente
                    Intent intent = new Intent(activity, MenuPatientActivity.class);
                    activity.startActivity(intent);
                }
                else if (userType.equals("C")) {   // Coletor
                    Intent intent = new Intent(activity, MenuCollectorActivity.class);
                    activity.startActivity(intent);
                }
                else {   // Gestor
                    Intent intent = new Intent(activity, MenuAdminActivity.class);
                    activity.startActivity(intent);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {}
        });

    }

    public static String getUserID(){
        return getCurrentFbUser().getUid();
    }

}
