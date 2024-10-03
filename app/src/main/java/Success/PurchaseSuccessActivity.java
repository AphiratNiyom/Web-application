package Success;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobile.MainActivity;
import com.example.mobile.R;

public class PurchaseSuccessActivity extends AppCompatActivity {

    TextView textViewOrderDetails;
    Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_success);

        closeButton = findViewById(R.id.close_button);

        closeButton.setOnClickListener(v -> {
            Intent intent = new Intent(PurchaseSuccessActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}