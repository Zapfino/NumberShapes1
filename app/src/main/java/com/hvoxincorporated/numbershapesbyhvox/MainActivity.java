package com.hvoxincorporated.numbershapesbyhvox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number {
        long Number;

        public boolean square() {
            if (Number < 0) {
                return false;
            }
            long sqrt = (long) (Math.sqrt(Number));
            return sqrt * sqrt == Number;
        }

        public boolean triangular() {
            long n = 8 * Number + 1;
            if (n < 0) {
                return false;
            }
            long sqrtn = (long) (Math.sqrt(n));
            return sqrtn * sqrtn == n;
        }
    }
    public void Result (View view) {
        Number custom = new Number();
        final EditText userNumber = (EditText) findViewById(R.id.UserNumber);
        custom.Number = Long.parseLong(userNumber.getText().toString());
        if (custom.square() && custom.triangular()) {
            Toast.makeText(getApplicationContext(), custom.Number + " is a triangular number & a perfect square.", Toast.LENGTH_SHORT).show();}
            else
            if (custom.triangular()) {
                Toast.makeText(getApplicationContext(), custom.Number + " is a triangular number.", Toast.LENGTH_LONG).show();}
        else
                if (custom.square()) {
                    Toast.makeText(getApplicationContext(), custom.Number + " is a perfect square.", Toast.LENGTH_LONG).show();}
        else Toast.makeText(getApplicationContext(), custom.Number + " is neither a triangular number nor a perfect square.", Toast.LENGTH_LONG).show();

        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
