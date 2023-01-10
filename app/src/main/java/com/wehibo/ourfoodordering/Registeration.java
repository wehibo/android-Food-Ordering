package com.wehibo.ourfoodordering;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myrestaurant.databinding.ActivityRegisterationBinding;
import com.example.myrestaurant.wehib.users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Registeration extends AppCompatActivity {

    ActivityRegisterationBinding binding;


    private FirebaseAuth mAuth;
    FirebaseDatabase database;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        getSupportActionBar().hide();

        progressDialog = new ProgressDialog(Registeration.this);
        progressDialog.setTitle("creating Account");
        progressDialog.setMessage("creating account ");

        binding.registerR.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (!binding.nameR.getText().toString().isEmpty() && !binding.emailR.getText().toString().isEmpty() && !binding.nameR.getText().toString().isEmpty()) {
                    progressDialog.show();
                    mAuth.createUserWithEmailAndPassword(binding.emailR.getText().toString(), binding.passwordR.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressDialog.dismiss();
                                    if (task.isSuccessful()) {
                                        users use=new users(binding.nameR.getText().toString(),binding.emailR.getText().toString(),binding.passwordR.getText().toString());
                                        String id=task.getResult().getUser().getUid();
                                        database.getReference().child("users").child(id).setValue(use);
                                        Toast.makeText(Registeration.this, "SingUp successfuly", Toast.LENGTH_SHORT).show();

                                    } else {
                                        Toast.makeText(Registeration.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
                else{
                    Toast.makeText(Registeration.this, "Enter Credentials", Toast.LENGTH_SHORT).show();
                }

            }
        });
        binding.signupR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Registeration.this,Login.class);
                startActivity(intent);
            }
        });


    }
}