package me.nothing.ca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.util.HashMap;



public class MainActivity extends AppCompatActivity {


    Button mFetchBtn;
    Button mFirstBtn;
    File mTargetFile;

    ImageView mimg1;
    ImageView mimg2;
    ImageView mimg3;
    ImageView mimg4;
    ImageView mimg5;
    ImageView mimg6;
    ImageView mimg7;
    ImageView mimg8;
    ImageView mimg9;
    ImageView mimg10;

    static final Map<Integer, String> myMap = new HashMap<Integer,String>();

    static final List<String> selected = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String filePath = "photos";
        mTargetFile = new File(getFilesDir(),filePath+"/");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selected.clear();
        myMap.clear();

        mFirstBtn = findViewById(R.id.firstBtn);
        mFetchBtn = findViewById(R.id.fetch);

        mimg1 = findViewById(R.id.img1);
        mimg2 = findViewById(R.id.img2);
        mimg3 = findViewById(R.id.img3);
        mimg4 = findViewById(R.id.img4);
        mimg5 = findViewById(R.id.img5);
        mimg6 = findViewById(R.id.img6);
        mimg7 = findViewById(R.id.img7);
        mimg8 = findViewById(R.id.img8);
        mimg9 = findViewById(R.id.img9);
        mimg10 = findViewById(R.id.img10);


        mimg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(1))){
                    selected.remove(getUrl(1));
                    mimg1.setAlpha((float) 1);
                }else {
                    if(selected.size() < 6){
                        mimg1.setAlpha((float) 0.5);
                        selectPhoto(1);
                    }else{
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        mimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(2))){
                    selected.remove(getUrl(2));
                    mimg2.setAlpha((float) 1);
                }else{
                    if(selected.size() < 6){
                        mimg2.setAlpha((float) 0.5);
                        selectPhoto(2);
                    }else {
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        mimg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(3))){
                    selected.remove(getUrl(3));
                    mimg3.setAlpha((float) 1);
                }else{
                    if(selected.size() < 6){
                        mimg3.setAlpha((float) 0.5);
                        selectPhoto(3);
                    }else{
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        mimg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(4))){
                    selected.remove(getUrl(4));
                    mimg4.setAlpha((float) 1);
                }else{
                    if(selected.size() < 6){
                        mimg4.setAlpha((float) 0.5);
                        selectPhoto(4);
                    }else{
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        mimg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(5))){
                    selected.remove(getUrl(5));
                    mimg5.setAlpha((float) 1);
                }else{
                    if(selected.size() < 6){
                        mimg5.setAlpha((float) 0.5);
                        selectPhoto(5);
                    }else{
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        mimg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(6))){
                    selected.remove(getUrl(6));
                    mimg6.setAlpha((float) 1);
                }else{
                    if(selected.size() < 6){
                        mimg6.setAlpha((float) 0.5);
                        selectPhoto(6);
                    }else{
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        mimg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(7))){
                    selected.remove(getUrl(7));
                    mimg7.setAlpha((float) 1);
                }else{
                    if(selected.size() < 6){
                        mimg7.setAlpha((float) 0.5);
                        selectPhoto(7);
                    }else{
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        mimg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(8))){
                    selected.remove(getUrl(8));
                    mimg8.setAlpha((float) 1);
                }else{
                    if(selected.size() < 6){
                        mimg8.setAlpha((float) 0.5);
                        selectPhoto(8);
                    }else{
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
                }
        });
        mimg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(9))){
                    selected.remove(getUrl(9));
                    mimg9.setAlpha((float) 1);
                }else{
                    if(selected.size() < 6){
                        mimg9.setAlpha((float) 0.5);
                        selectPhoto(9);
                    }else{
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
                }
        });
        mimg10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.contains(getUrl(10))){
                    selected.remove(getUrl(10));
                    mimg10.setAlpha((float) 1);
                }else{
                    if(selected.size() < 6){
                        mimg10.setAlpha((float) 0.5);
                        selectPhoto(10);
                    }else{
                        Toast.makeText(MainActivity.this,
                                "already choose 6 photos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        mFetchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadPhoto();
            }
        });
        mFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected.size() == 6){
                openNewActivity();
                }else{
                    int i = 6 - selected.size();
                    Toast.makeText(MainActivity.this,
                            "you need to choose "+ i +" more photos",
                            Toast.LENGTH_LONG).show();
                }

            }
        });

    }



    public void selectPhoto(int i){
        if(selected.size() < 6) {
            selected.add(myMap.get(i));
        }
    }
    public String getUrl(int i){
        return "/data/user/0/me.nothing.ca/files/photos/" + i + ".jpg";
    }
    public void openNewActivity(){
        Intent intent = new Intent(this,  Activity2.class);
        String[] mySelect = new String[selected.size()];
        int si = selected.size();
        for(int i=0;i<selected.size();i++){
            mySelect[i] = selected.get(i);
        }

        intent.putExtra("selected",mySelect);
        startActivity(intent);
    }
    public void loadPhoto() {
            File dir = mTargetFile;
            boolean isit = dir.isDirectory();
            if (dir.isDirectory()) {
                String[] childern = dir.list();
                System.out.print(childern);
                for (int i = 1; i <= childern.length; i++) {

                    File imgFile = new File("/data/user/0/me.nothing.ca/files/photos/" + i + ".jpg");

                    if (imgFile.exists()) {
                        Bitmap imgBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
                        if(i == 1) {
                            myMap.put(i,imgFile.toString());
                            mimg1.setImageBitmap(imgBitmap);
                        }else if(i == 2){
                            myMap.put(i,imgFile.toString());
                            mimg2.setImageBitmap(imgBitmap);
                        }else if(i == 3){
                            myMap.put(i,imgFile.toString());
                            mimg3.setImageBitmap(imgBitmap);
                        }else if(i == 4){
                            myMap.put(i,imgFile.toString());
                            mimg4.setImageBitmap(imgBitmap);
                        }else if(i == 5){
                            myMap.put(i,imgFile.toString());
                            mimg5.setImageBitmap(imgBitmap);
                        }else if(i == 6){
                            myMap.put(i,imgFile.toString());
                            mimg6.setImageBitmap(imgBitmap);
                        }else if(i == 7){
                            myMap.put(i,imgFile.toString());
                            mimg7.setImageBitmap(imgBitmap);
                        }else if(i == 8){
                            myMap.put(i,imgFile.toString());
                            mimg8.setImageBitmap(imgBitmap);
                        }else if(i == 9){
                            myMap.put(i,imgFile.toString());
                            mimg9.setImageBitmap(imgBitmap);
                        }else if(i == 10){
                            myMap.put(i,imgFile.toString());
                            mimg10.setImageBitmap(imgBitmap);
                        }

                    }
                }

            }
        }


}

