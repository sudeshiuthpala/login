package com.example.myapp4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Interface extends AppCompatActivity {
    Button vanOwnerRegBtn,parentRegBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg_interface);

        vanOwnerRegBtn=findViewById(R.id.vanOwnerRegBtn);
        parentRegBtn=findViewById(R.id.parentRegBtn);
        vanOwnerRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Interface.this,VanOwnerPart1.class);
                startActivity(intent);
            }
        });
        parentRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Interface.this,ParentPart1.class);
                startActivity(intent);
            }
        });
    }
}