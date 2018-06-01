package e.wilso.async;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private Button go1, go2, go3;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      go1 = findViewById(R.id.go1);
      go2 = findViewById(R.id.go2);
      go3 = findViewById(R.id.go3);

      go1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
      });

      go2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
      });

      go3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
      });

   }
}
