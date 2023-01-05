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
                final_(1,mimg1);
            }
        });
        mimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final_(2,mimg2);
            }
        });
        mimg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final_(3,mimg3);
            }
        });
        mimg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final_(4,mimg4);
            }
        });
        mimg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final_(5,mimg5);
            }
        });
        mimg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final_(6,mimg6);
            }
        });
        mimg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final_(7,mimg7);
            }
        });
        mimg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final_(8,mimg8);
            }
        });
        mimg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final_(9,mimg9);
            }
        });
        mimg10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final_(10,mimg10);
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


    public void final_(int i, ImageView img){
        if(selected.contains(getUrl(i))){
            selected.remove(getUrl(i));
            img.setAlpha((float) 1);
        }else {
            if(selected.size() < 6){
                img.setAlpha((float) 0.5);
                selectPhoto(i);
            }else{
                Toast.makeText(MainActivity.this,
                        "already choose 6 photos",
                        Toast.LENGTH_SHORT).show();
            }
        }
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

    public void setDelay(File file,ImageView imgView, int loopValue){
        imgView.postDelayed(new Runnable() {
            @Override
            public void run() {
                myMap.put(loopValue,file.toString());
                Bitmap imgBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                imgView.setImageBitmap(imgBitmap);
            }
        },loopValue * 300);
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
                        if(i == 1) {
                            setDelay(imgFile,mimg1,i);
                        }else if(i == 2){
                            setDelay(imgFile,mimg2,i);
                        }else if(i == 3){
                            setDelay(imgFile,mimg3,i);
                        }else if(i == 4){
                            setDelay(imgFile,mimg4,i);
                        }else if(i == 5){
                            setDelay(imgFile,mimg5,i);
                        }else if(i == 6){
                            setDelay(imgFile,mimg6,i);
                        }else if(i == 7){
                            setDelay(imgFile,mimg7,i);
                        }else if(i == 8){
                            setDelay(imgFile,mimg8,i);
                        }else if(i == 9){
                            setDelay(imgFile,mimg9,i);
                        }else if(i == 10){
                            setDelay(imgFile,mimg10,i);
                        }

                    }
                }

            }
        }


}

