package com.example.myrestaurant;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myrestaurant.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {


        ActivityLoginBinding binding;

        FirebaseAuth mAuth;
        FirebaseDatabase firebaseDatabase;
        ProgressDialog progressDialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            binding = ActivityLoginBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            getSupportActionBar().hide();

            mAuth = FirebaseAuth.getInstance();
            firebaseDatabase = FirebaseDatabase.getInstance();

            progressDialog = new ProgressDialog(Login.this);
            progressDialog.setTitle("login");
            progressDialog.setMessage("please waitvalidation in progress ");

            binding.registerR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!binding.emailR.getText().toString().isEmpty() && !binding.passwordR.getText().toString().isEmpty()) {
                        progressDialog.show();
                        mAuth.signInWithEmailAndPassword(binding.emailR.getText().toString(), binding.passwordR.getText().toString())
                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        progressDialog.dismiss();
                                        if (task.isSuccessful()) {
                                            Intent intent = new Intent(Login.this, MainActivity.class);
                                            startActivity(intent);

                                        } else {
                                            Toast.makeText(Login.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                    } else {
                        Toast.makeText(Login.this, "Enter the empty field ", Toast.LENGTH_SHORT).show();
                    }
                }
            });
binding.signupR.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent(Login.this,Registeration.class);
        startActivity(intent);
    }
});

        }
    }
