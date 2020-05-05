package com.myapplicationdev.android.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText etAmountM;
    EditText etPaxM;
    EditText etDiscountM;
    ToggleButton tgSVSM;
    ToggleButton tgGSTM;
    TextView showBillM;
    TextView showDividedM;
    Button btnSplitM;
    Button btnResetM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAmountM = findViewById(R.id.etAmount);
        etPaxM = findViewById(R.id.etPeople);
        etDiscountM = findViewById(R.id.etDiscount);
        tgSVSM = findViewById(R.id.tgSvs);
        tgGSTM = findViewById(R.id.tgGst);
        showBillM = findViewById(R.id.tvShowBill);
        showDividedM = findViewById(R.id.tvShowDivided);
        btnSplitM = findViewById(R.id.buttonSplit);
        btnResetM = findViewById(R.id.buttonClear);

        btnSplitM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String strAmount = etAmountM.getText().toString();
               String strPax = etPaxM.getText().toString();
               double TotalDiscount = 0.0;
               if(tgSVSM.isChecked()){
                   TotalDiscount = Double.parseDouble(etAmountM) + 0.1 ;
               }

            }
        });
    }
}




