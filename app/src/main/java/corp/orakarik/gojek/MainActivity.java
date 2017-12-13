package corp.orakarik.gojek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Gosend(View view) {
        Toast.makeText(this, "Gosend", Toast.LENGTH_SHORT).show();

        Intent in = new Intent(this,Main2Activity.class);
        startActivity(in);


    }
}
