package usa.salamanca.zonas.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import usa.salamanca.zonas.R;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        Button restablecerPass =(Button) findViewById(R.id.btn_envpass);
        EditText CorreoRecuperacion = (EditText) findViewById(R.id.editTextTextEmailAddress);

        restablecerPass.setOnClickListener(new View.OnClickListener() {

            String correo = CorreoRecuperacion.getText().toString();
            String mensaje = "Correo Enviado" + correo;

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
                Intent MainActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(MainActivity);
            }
        });

    }
}