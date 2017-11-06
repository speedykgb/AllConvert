package sg.com.kaplan.allconvert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button button1,button2,button3,button4,button5;
    public void init(){
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "LENGTH CONVERTER", Toast.LENGTH_SHORT).show(); // Toast message to advise which activity the user has selected.
                Intent length=new Intent(MainActivity.this,Length.class);
                startActivity(length);
            }
        });
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "WEIGHT CONVERTER", Toast.LENGTH_SHORT).show(); // Toast message to advise which activity the user has selected.
                Intent weight=new Intent(MainActivity.this,Weight.class);
                startActivity(weight);
            }
        });

        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "VOLUME CONVERTER", Toast.LENGTH_SHORT).show();// Toast message to advise which activity the user has selected.
                Intent volume=new Intent(MainActivity.this,Volume.class);
                startActivity(volume);
            }
        });

        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "AREA CONVERTER", Toast.LENGTH_SHORT).show();// Toast message to advise which activity the user has selected.
                Intent area=new Intent(MainActivity.this,Area.class);
                startActivity(area);
            }
        });

        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "TEMPERATURE CONVERTER", Toast.LENGTH_SHORT).show(); // Toast message to advise which activity the user has selected.
                Intent temperature=new Intent(MainActivity.this,Temp.class);
                startActivity(temperature);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }



}