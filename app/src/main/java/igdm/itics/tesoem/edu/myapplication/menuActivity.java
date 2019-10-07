package igdm.itics.tesoem.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void QueEsElFolclore(View v){
        Intent btn1 = new Intent(this,queActivity.class);
        startActivity(btn1);
        finish();
    }

    public void DanzaRegional(View v){
        Intent btn2 = new Intent(this,danzaActivity.class);
        startActivity(btn2);
        finish();
    }

    public void chilenas(View v){
        Intent btn3 = new Intent(this,chilenasActivity.class);
        startActivity(btn3);
        finish();
    }
    public void jarabes(View v){
        Intent btn4 = new Intent(this,jarabesActivity.class);
        startActivity(btn4);
        finish();
    }
    public void jaranas(View v){
        Intent btn5 = new Intent(this,jaranasActivity.class);
        startActivity(btn5);
        finish();
    }
    public void polkas(View v){
        Intent btn6 = new Intent(this,polkasActivity.class);
        startActivity(btn6);
        finish();
    }
    public void redobas(View v){
        Intent btn7 = new Intent(this,redobasActivity.class);
        startActivity(btn7);
        finish();
    }
    public void chotis(View v){
        Intent btn8 = new Intent(this,chotisActivity.class);
        startActivity(btn8);
        finish();
    }
    public void sones(View v){
        Intent btn9 = new Intent(this,sonesActivity.class);
        startActivity(btn9);
        finish();
    }
    public void vals(View v){
        Intent btn10 = new Intent(this,valsActivity.class);
        startActivity(btn10);
        finish();
    }
}
