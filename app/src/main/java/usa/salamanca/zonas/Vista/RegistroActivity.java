package usa.salamanca.zonas.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import usa.salamanca.zonas.R;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button botonCondiciones = (Button) findViewById(R.id.btn_condiciones);
        botonCondiciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Aceptar Terminos", Toast.LENGTH_SHORT).show();
                Intent CondicionesActivity = new Intent(getApplicationContext(), Condiciones.class);
                startActivity(CondicionesActivity);
            }
        });
    }
}