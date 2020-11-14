package com.example.myapp4;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class VanOwnerPart1 extends AppCompatActivity {
    EditText FNameEt,MNameEt,LNameEt,NicEt,dobEt,emailEt,addressEt,mobileEt,cityEt,licenceNumEt,passEt,regDateEt;
    RadioGroup gender;
    RadioButton male,female;
    String g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.van_owner_reg_part1);
        FNameEt=(EditText)findViewById(R.id.ownerFName);
        MNameEt=(EditText)findViewById(R.id.ownerMName);
        LNameEt=(EditText)findViewById(R.id.ownerLName);
        NicEt=(EditText)findViewById(R.id.ownerNic);
        gender=(RadioGroup)findViewById(R.id.ownwrGender);
        dobEt=(EditText)findViewById(R.id.editTextOwnerDob);
        emailEt=(EditText)findViewById(R.id.editTextOwnerEmail);
        addressEt=(EditText)findViewById(R.id.editTextOwnerAddress);
        mobileEt=(EditText)findViewById(R.id.editTextOwnerPhone);
        cityEt=(EditText)findViewById(R.id.editTextOwnerCity);
        licenceNumEt=(EditText)findViewById(R.id.editTextOwnerLicence);
        passEt=(EditText)findViewById(R.id.editTextOwnerPassword);
        regDateEt=(EditText)findViewById(R.id.editTextOwnerRegDate);


    }
    public  void  onReg1(View view){
        String FName=FNameEt.getText().toString();
        String MName=MNameEt.getText().toString();
        String LName=LNameEt.getText().toString();
        String Nic=NicEt.getText().toString();
        String owner_gender=g;
        String dob=dobEt.getText().toString();
        String email=emailEt.getText().toString();
        String address=addressEt.getText().toString();
        String mobile=mobileEt.getText().toString();
        String city=cityEt.getText().toString();
        String licenceNumber=licenceNumEt.getText().toString();
        String Password=passEt.getText().toString();
        String regDate=regDateEt.getText().toString();
        String type="Reg";
        RegBackground1 bg=new RegBackground1(this);
        bg.execute(type,FName,MName,LName,Nic,owner_gender,dob,email,address,mobile,city,licenceNumber,Password,regDate);
    }


    public void onRediobtnchecked(View view) {
        int checkId=gender.getCheckedRadioButtonId();
        switch (checkId){
            case R.id.ownerMale:
                g="Male";
                break;
            case R.id.ownerFemale:
                g="Female";
                break;
            default:
                g="No";
        }
    }
}