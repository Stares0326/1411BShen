package test.bwie.myframdlayout;

import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) this.findViewById(R.id.button);

//        MyListener myListener = new MyListener();
//        button.setOnClickListener(myListener);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast haha = Toast.makeText(MainActivity.this, "haha", Toast.LENGTH_SHORT);
                haha.show();



            }
        });
    }

//    class MyListener implements View.OnClickListener{
//
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(MainActivity.this, "haha", Toast.LENGTH_SHORT).show();
//
//        }
//    }
}
