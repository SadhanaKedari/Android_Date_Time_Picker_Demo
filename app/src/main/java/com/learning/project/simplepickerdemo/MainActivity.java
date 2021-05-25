package com.learning.project.simplepickerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePicker(View v){
        DialogFragment dateDialogFrag = new DateTimePicker();
        dateDialogFrag.show(getSupportFragmentManager(), getString(R.string.date));
    }

    public void showTimePicker(View v){
        DialogFragment timePickerDialog = new TimePicker();
        timePickerDialog.show(getSupportFragmentManager(), getString(R.string.time));
    }
}