package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.spinner.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        ArrayList<String> arrIds=new ArrayList<>();

        arrIds.add("Aadhar Card");
        arrIds.add("PAN Card");
        arrIds.add("Ration Card");
        arrIds.add("Voter Id Card");
        arrIds.add("Driving License Card");
        arrIds.add("XII Certificate");
        arrIds.add("X Certificate");
        arrIds.add("Passport");
        arrIds.add("Bank Passbook");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,arrIds);
        binding.spinner.setAdapter(adapter);
    }
}