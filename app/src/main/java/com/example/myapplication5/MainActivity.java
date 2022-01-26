package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //definir que componentes van a ser utilizados.
    //edit text le indica android que se puede editar
    //et son los edit text de la vista en este caso quimica/fisica/matematicas
    private EditText et1;
    private EditText et2;
//    private EditText et3;
    //textview que muestra el resultado
    private TextView tv1;
    // los radios ahora
    private RadioButton rb1,rb2;
    //los checkbox
    //private CheckBox ch1,ch2;
    //solo los componentes, en este punto no estan conectados conb los componentes del diseño


    @Override
    //proceso que nos permite crear una app (sino no funciona)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //contexto, texto, tiempo de duracion
        Toast.makeText(this, "creada" , Toast.LENGTH_SHORT).show();
        // La actividad está creada

        // indicarle que en los componentes declarados anteriormente busque los componentes del diseño por el id
        // casteo que busque la vista por ID con la clase R (puente de comunicacion entre lo logico y lo grafico)
        //ahora si esta la coneccion
        //ahora se "recupera" los valores de los componentes
        //en este caso de los edit text
        //et1= (EditText) findViewById(R.id.txt_num1);
        et2=(EditText) findViewById(R.id.txt_num2);
//        et3=(EditText)findViewById(R.id.txt_num3);
        //el textview
        tv1=(TextView) findViewById(R.id.txt_resultado);
        //para los radiobutton
        //La clase R como puente de comunicación
        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
//        rb3=(RadioButton) findViewById(R.id.radio3);
        //la coneccion con los checkbox
//        ch1=(CheckBox) findViewById(R.id.ch1);
//        ch2=(CheckBox) findViewById(R.id.ch2);
    }

    //Este metodo realiza la suma
    public void suma (View view){
        String valor1=et2.getText().toString();

        float polenta=Float.parseFloat(valor1);
        //regla de tres

        float suma=(polenta*150)/200;
        float aguaparaalcohol=0;
        float alcohol=0;
        String respuesta="";
        //En este caso se hizo asi la creacion de los if para que contemple los dos!

        if(rb1.isChecked()== true){
            respuesta="se necesitan "+suma+" gr de Harina ";
        }else if (rb2.isChecked()== true){
            alcohol=(70*polenta)/100;
            aguaparaalcohol=(30*polenta)/100;
            respuesta="se necesitan "+alcohol+"ml de alcohol"+"\n"+"y"+"\n"+aguaparaalcohol+"ml de Agua ";
        }
        tv1.setText(respuesta);



    }
//    public void resta (View view){
//        String valor1=et1.getText().toString();
//        String valor2=et2.getText().toString();
//        String valor3=et3.getText().toString();
//        int num1=Integer.parseInt(valor1);
//        int num2=Integer.parseInt(valor2);
//        int num3=Integer.parseInt(valor3);
//
//        int suma=(num1+num2+num3)/3;
//        String result= String.valueOf(suma);
//
//    }

    @Override
    protected void onStart() {
        super.onStart();
        //Totast permite mostrar mensaje a travez de capas, previamente se debe importar
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }

}