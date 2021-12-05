package usa.salamanca.zonas.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import usa.salamanca.zonas.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button botonLogin = (Button) findViewById(R.id.btn_login);
        botonLogin.setOnClickListener(new View.OnClickListener() {

            EditText edtUsuarios = (EditText) findViewById(R.id.edtUsuario);
            @Override
            public void onClick(View v) {
                String usuario = edtUsuarios.getText().toString();
                String mensaje = "Bienvenido: " + usuario;
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
                Intent ReporActivity = new Intent(getApplicationContext(), ReporActivity.class);
                startActivity(ReporActivity);
            }

        });


        Button botonResPass = (Button) findViewById(R.id.btn_respass);
        botonResPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Restaurar Contraseña", Toast.LENGTH_SHORT).show();
                Intent ResetPasswordActivity = new Intent(getApplicationContext(), ResetPasswordActivity.class);
                startActivity(ResetPasswordActivity);
            }
        });


        Button botonRegistrar = (Button) findViewById(R.id.btn_registar);
        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nuevo Registro", Toast.LENGTH_SHORT).show();
                Intent RegistroActivity = new Intent(getApplicationContext(), RegistroActivity.class);
                startActivity(RegistroActivity);
            }
        });


    }
}