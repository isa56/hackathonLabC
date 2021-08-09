package br.com.isa56.hackathonlabcv.helper;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

import br.com.isa56.hackathonlabcv.config.FirebaseConfig;

public class FirebaseUserHelper {

    public static FirebaseUser getCurrentFbUser(){
        FirebaseAut user = FirebaseConfig.getFirebaseAuth();
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

}
