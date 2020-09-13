package com.elanilsondejesus.com.dialogcustomaula001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialogCustom (View view){
        final BottomSheetDialog sheetDialog = new BottomSheetDialog( MainActivity.this,
                R.style.Theme_Design_BottomSheetDialog);

        View sheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.dialogcustom,(LinearLayout)findViewById(R.id.layoutSheet));

        sheetView.findViewById(R.id.textViewCompartilhar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Compartilhando.....", Toast.LENGTH_SHORT).show();
            }
        });

        sheetView.findViewById(R.id.textViewFavorites).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Favoritando....", Toast.LENGTH_SHORT).show();
            }
        });

        sheetView.findViewById(R.id.buttonclose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sheetDialog.dismiss();
            }
        });

        sheetDialog.setContentView(sheetView);
        sheetDialog.show();
    }
}