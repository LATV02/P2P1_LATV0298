package latv.itics.tesoem.edu.p2p1_latv0298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rmasculino, rfemenino;
    RadioButton msuma, mresta, mmultiplicacion, mdivision;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rmasculino = (RadioButton) findViewById(R.id.rmasculino);
        rfemenino = (RadioButton) findViewById(R.id.rfemenino);

        msuma = (RadioButton) findViewById(R.id.msuma);
        mresta = (RadioButton) findViewById(R.id.mresta);
        mmultiplicacion = (RadioButton) findViewById(R.id.mmultiplicacion);
        mdivision = (RadioButton) findViewById(R.id.mdivision);
        result=(TextView) findViewById(R.id.result);
    }
    public void mensaje(View v){
        if (rmasculino.isChecked()){
            Toast.makeText(this,"Seleccionaste Masculino", Toast.LENGTH_LONG).show();
        }

        if (rfemenino.isChecked()){
            Toast.makeText(this,"Seleccionaste Femenino", Toast.LENGTH_LONG).show();
        }

    }
    public void math (View v){
        if (msuma.isChecked()) {

            EditText num1= (EditText) findViewById(R.id.txtnum1);
            EditText num2= (EditText) findViewById(R.id.txtnum2);
            Double int1 = Double.parseDouble(num1.getText().toString());
            Double int2 = Double.parseDouble(num2.getText().toString());

            Double res = int1+int2;
            result.setText(""+res);
        }


        if (mresta.isChecked()) {

            EditText num1= (EditText) findViewById(R.id.txtnum1);
            EditText num2= (EditText) findViewById(R.id.txtnum2);
            Double int1 = Double.parseDouble(num1.getText().toString());
            Double int2 = Double.parseDouble(num2.getText().toString());

            Double res = int1-int2;
            result.setText(""+res);
        }


        if (mmultiplicacion.isChecked()) {

            EditText num1= (EditText) findViewById(R.id.txtnum1);
            EditText num2= (EditText) findViewById(R.id.txtnum2);
            Double int1 = Double.parseDouble(num1.getText().toString());
            Double int2 = Double.parseDouble(num2.getText().toString());

            Double res = int1*int2;
            result.setText(""+res);
        }


        if (mdivision.isChecked()) {

            EditText num1= (EditText) findViewById(R.id.txtnum1);
            EditText num2= (EditText) findViewById(R.id.txtnum2);
            Double int1 = Double.parseDouble(num1.getText().toString());
            Double int2 = Double.parseDouble(num2.getText().toString());

            Double res = int1/int2;
            result.setText(""+res);
        }

}
}
