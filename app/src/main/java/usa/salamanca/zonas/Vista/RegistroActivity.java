package usa.salamanca.zonas.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import usa.salamanca.zonas.Controlador.ControladorPrincipal;
import usa.salamanca.zonas.R;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso1();
            }

        });
    }

    public void proceso1(){
        EditText nombre = findViewById(R.id.inputFirstname);
        EditText apellido = findViewById(R.id.inputLastname);
        Spinner lista = findViewById(R.id.inputType);
        EditText edad = findViewById(R.id.inputAge);
        EditText email = findViewById(R.id.inputEmail);
        EditText password = findViewById(R.id.inputClave);
        try {
            JSONObject informacion = new JSONObject();
            informacion.put("firstname",nombre.getText());
            informacion.put("lastname",apellido.getText());
            informacion.put("age",edad.getText());
            informacion.put("movetype",lista.getSelectedItem().toString());
            ControladorPrincipal.registrarUsuario(informacion);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}