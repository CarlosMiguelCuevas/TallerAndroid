package mx.com.cubozsoft.apprentice;

import android.content.Intent;
import android.graphics.drawable.Drawable;
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
        int id_image = 0;
        String desc = "";
        String name = "";

        switch (v.getId()){
            case R.id.pokelist_1:
                id_image = R.drawable.bolba;
                desc = getString(R.string.pokemon1_desc);
                name = getString(R.string.pokemon1_name);
                break;

            case R.id.pokelist_2:
                id_image = R.drawable.squirtle;
                desc = getString(R.string.pokemon2_desc);
                name = getString(R.string.pokemon2_name);
                break;

            case R.id.pokelist_3:
                id_image = R.drawable.charmander;
                desc = getString(R.string.pokemon3_desc);
                name = getString(R.string.pokemon3_name);
                break;

            case R.id.pokelist_4:
                id_image = R.drawable.pika;
                desc = getString(R.string.pokemon4_desc);
                name = getString(R.string.pokemon4_name);
                break;
        }

        Intent detailIntent = new Intent(this,Pokemon_detal.class);
        detailIntent.putExtra(Pokemon_detal.IMG_DETAIL,id_image);
        detailIntent.putExtra(Pokemon_detal.NAME_DETAIL,name);
        detailIntent.putExtra(Pokemon_detal.DESC_DETAIL,desc);

        startActivity(detailIntent);
    }
}
