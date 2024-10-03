package com.example.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import Success.PurchaseSuccessActivity;

public class OrderFormActivity extends AppCompatActivity {

    EditText editTextName, editTextAddress, editTextPhone;
    Button buttonPlaceOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_from);

        editTextName = findViewById(R.id.editTextName);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextPhone = findViewById(R.id.editTextPhone);
        buttonPlaceOrder = findViewById(R.id.buttonPlaceOrder);

        String productName = getIntent().getStringExtra("productName");
        int productPrice = getIntent().getIntExtra("productPrice", 0);

        buttonPlaceOrder.setOnClickListener(v -> {
            String name = editTextName.getText().toString();
            String address = editTextAddress.getText().toString();
            String phone = editTextPhone.getText().toString();

            Intent intent = new Intent(OrderFormActivity.this, PurchaseSuccessActivity.class);
            startActivity(intent);

            intent.putExtra("name", name);
            intent.putExtra("address", address);
            intent.putExtra("phone", phone);
            intent.putExtra("productName", productName);
            intent.putExtra("productPrice", productPrice);

            startActivity(intent);
        });
    }
}