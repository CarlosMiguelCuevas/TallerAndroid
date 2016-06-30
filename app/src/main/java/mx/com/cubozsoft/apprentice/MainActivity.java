package mx.com.cubozsoft.apprentice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bulba = (ImageView) findViewById(R.id.pokelist_1);
        ImageView squa = (ImageView) findViewById(R.id.pokelist_2);
        ImageView charm = (ImageView) findViewById(R.id.pokelist_3);
        ImageView pika = (ImageView) findViewById(R.id.pokelist_4);

        bulba.setOnClickListener(this);
        squa.setOnClickListener(this);
        charm.setOnClickListener(this);
        pika.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.pokelist_1:
                Toast.makeText(this,getString(R.string.pokemon1_name),Toast.LENGTH_SHORT).show();
                break;
            case R.id.pokelist_2:
                Toast.makeText(this,getString(R.string.pokemon2_name),Toast.LENGTH_SHORT).show();
                break;
            case R.id.pokelist_3:
                Toast.makeText(this,getString(R.string.pokemon3_name),Toast.LENGTH_SHORT).show();
                break;
            case R.id.pokelist_4:
                Toast.makeText(this,getString(R.string.pokemon4_name),Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
