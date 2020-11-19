package edu.upc.dsa.primeraprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity {

    public int variable;

    public MainActivity(){

        variable=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAceptarClicked(View v){
        Log.d("MYAPP","Has clickado el btn");
        StyleableToast.makeText(this,"Has clickado el boton", R.style.exampleToast).show();
        variable++;
    }

}