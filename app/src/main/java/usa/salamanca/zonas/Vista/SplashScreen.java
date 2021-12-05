package usa.salamanca.zonas.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import usa.salamanca.zonas.Controlador.MapsActivity;
import usa.salamanca.zonas.R;


public class SplashScreen extends AppCompatActivity implements Runnable {

    Thread hilo_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView portada = (ImageView) findViewById(R.id.frontImage);
        portada.setImageResource(R.drawable.front);

        hilo_1 = new Thread(this);
        hilo_1.start();
    }


    @Override
    public void run() {

        try{

            //Aquí irían las instrucciones para el cargue de información y otras actividades
            Thread.sleep(5000);

            Intent nextScreen = new Intent(getApplicationContext() , MapsActivity.class);
            startActivity(nextScreen);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}