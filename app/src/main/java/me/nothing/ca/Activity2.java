package me.nothing.ca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity {

    File mTargetFile;
    Button mSecbtn;
    TextView mtextView;
    ImageView mimg1;
    ImageView mimg2;
    ImageView mimg3;
    ImageView mimg4;
    ImageView mimg5;
    ImageView mimg6;

    static final List<String> selectedList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String filePath = "photos";
        mTargetFile = new File(getFilesDir(),filePath+"/");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        mimg1 = findViewById(R.id.img1);
        mimg2 = findViewById(R.id.img2);
        mimg3 = findViewById(R.id.img3);
        mimg4 = findViewById(R.id.img4);
        mimg5 = findViewById(R.id.img5);
        mimg6 = findViewById(R.id.img6);
        mSecbtn = findViewById(R.id.secBtn);


        Intent intent = getIntent();
        String[] selected = intent.getStringArrayExtra("selected");

        for(int i = 0;i<selected.length;i++){
            selectedList.add(selected[i]);
        }
        loadPhoto();


        mSecbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedList.clear();
                openNewActivity();
            }
        });

    }


    public void openNewActivity(){
            //deleteDir();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    public void loadPhoto() {

            for (int i = 0; i < selectedList.size(); i++) {

                File imgFile = new File(selectedList.get(i).toString());


                if (imgFile.exists()) {
                    Bitmap imgBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
                    if(i == 0) {
                        mimg1.setImageBitmap(imgBitmap);
                    }else if(i == 1){
                        mimg2.setImageBitmap(imgBitmap);
                    }else if(i == 2){
                        mimg3.setImageBitmap(imgBitmap);
                    }else if(i == 3){
                        mimg4.setImageBitmap(imgBitmap);
                    }else if(i == 4){
                        mimg5.setImageBitmap(imgBitmap);
                    }else if(i == 5){
                        mimg6.setImageBitmap(imgBitmap);
                    }


                }
            }

        //}
    }
    public void deleteDir() {
        try {
            File dir = mTargetFile;
            boolean isit = dir.isDirectory();//just debug
            if (dir.isDirectory()) {
                String[] children = dir.list();
                for (int i = 0; i < children.length; i++) {
                    new File(dir, children[i]).delete();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}