package fauzi.hilmy.quizandroidceklogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText)findViewById(R.id.editText);
        etPass = (EditText)findViewById(R.id.editText2);
    }

    public void doLogin(View view) {

        String nama = etNama.getText().toString();
        String pass = etPass.getText().toString();

        if (nama.isEmpty()){
            etNama.setError("Username tidak boleh kosong");
            etNama.requestFocus();
        }else if(pass.isEmpty()){
            etPass.setError("Password tidak boleh kosong");
            etPass.requestFocus();
        } else {
            if (nama.equalsIgnoreCase("bambang") && pass.equalsIgnoreCase("kitapastibisa")){
                startActivity(new Intent(MainActivity.this, loginActivity.class));
                finish();
            }else {
                Toast.makeText(this, "Username and Password is Wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
