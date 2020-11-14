package com.example.myapp4;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DriverReg extends AppCompatActivity {
    EditText FNameEt,MNameEt,LNameEt,NicEt,dobEt,emailEt,addressEt,mobileEt,ownerIdEt,vehicleIdEt,driverLicenceNumEt;
    RadioGroup gender;
    RadioButton male,female;
    String g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driver_reg_part1);
        FNameEt=(EditText)findViewById(R.id.editTextTextDriverFirstName);
        MNameEt=(EditText)findViewById(R.id.editTextDriverMiddleName);
        LNameEt=(EditText)findViewById(R.id.editTextDriverLastName);
        NicEt=(EditText)findViewById(R.id.editTextTextDriverNic);
        gender=(RadioGroup)findViewById(R.id.DriverGender);
        dobEt=(EditText)findViewById(R.id.editTextDriverDob);
        emailEt=(EditText)findViewById(R.id.editTextDriverEmailAddress);
        addressEt=(EditText)findViewById(R.id.editTextDriverPostalAddress);
        mobileEt=(EditText)findViewById(R.id.editTextDriverPhone);
        ownerIdEt=(EditText)findViewById(R.id.editTextOwnerId);
        vehicleIdEt=(EditText)findViewById(R.id.);
        passEt=(EditText)findViewById(R.id.editTextOwnerPassword);
        regDateEt=(EditText)findViewById(R.id.editTextOwnerRegDate);
    }

    public void onDriverReg(View view) {

    }
    public void onDriverRadio(View view) {
        int checkId=gender.getCheckedRadioButtonId();
        switch (checkId){
            case R.id.DriverMale:
                g="Male";
                break;
            case R.id.DriverFemale:
                g="Female";
                break;
            default:
                g="No";
        }
    }
}