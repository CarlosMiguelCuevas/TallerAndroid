package mx.com.cubozsoft.apprentice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Pokemon_detal extends AppCompatActivity {
    public static final String IMG_DETAIL = "pokeImage";
    public static final String NAME_DETAIL = "pokeName";
    public static final String DESC_DETAIL = "pokeDesc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detal);

        ImageView photo = (ImageView) findViewById(R.id.pokeImg_detail);
        TextView name = (TextView) findViewById(R.id.pokeName_detail);
        TextView desc = (TextView) findViewById(R.id.pokeDesc_detail);

        Bundle info = getIntent().getExtras();

        int id = info.getInt(IMG_DETAIL);


        photo.setImageResource(id);
        name.setText(info.getString(NAME_DETAIL));
        desc.setText(info.getString(DESC_DETAIL));
    }
}
