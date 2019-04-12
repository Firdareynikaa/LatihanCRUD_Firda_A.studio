package id.sch.smktelkommlg.www.latihancrud_firda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText name_login, editpassword;
    Button buttondaftar, buttonbatal;
    String Username = "FIRDA";
    String Password = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name_login = findViewById(R.id.name_login);
        editpassword = findViewById(R.id.editpassword);
        buttondaftar = findViewById(R.id.buttondaftar);
        buttonbatal = findViewById(R.id.buttonbatal);
        buttondaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name_login.getText().toString();
                String password = editpassword.getText().toString();
                if (password.equals(Password) &&
                        (username.equals(Username))) {
                    Intent intent = new Intent(Login.this, Agenda.class);
                    startActivity(intent);
                    login();
                } else {
                    Toast.makeText(Login.this, "Username dan Password Salah", Toast.LENGTH_LONG).show();
                }
            }

            private void login() {
            }
        });
        buttonbatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}