package igdm.itics.tesoem.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sonesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sones);
    }
    public void cargarpantalla2(View v) {
        Intent frm1 = new Intent(this, menuActivity.class);
        startActivity(frm1);
        finish();
    }
}
