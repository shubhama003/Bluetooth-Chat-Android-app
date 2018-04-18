package info.devexchanges.bluetoothchatapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgView = (ImageView)findViewById(R.id.imageView);

        Intent intent = getIntent();
        byte[] image = intent.getByteArrayExtra("image");
        Bitmap bitmap = BitmapFactory.decodeByteArray(image,0,image.length);
        imgView.setImageBitmap(bitmap);
    }
}
