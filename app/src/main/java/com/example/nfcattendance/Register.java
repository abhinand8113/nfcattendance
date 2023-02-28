package com.example.nfcattendance;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);
    }

    public void RegisterPrincipal(View v)
    {
        startActivity(new Intent(this, RegisterPrincipal.class));
    }
    public void RegisterHOD(View v)
    {
        startActivity(new Intent(this, RegisterHOD.class));
    }
    public void RegisterTeacher(View v)
    {
        startActivity(new Intent(this, TeacherRegister.class));
    }
}
