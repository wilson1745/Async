package e.wilso.async;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
            new Job1Task().execute();
         }
      });

      go2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            //new Job1Task().execute();
         }
      });

      go3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            //new Job1Task().execute();
         }
      });
   }

   class Job1Task extends AsyncTask<Void, Void, Void> {

      @Override
      protected Void doInBackground(Void... voids) {
         try {
            Thread.sleep(5000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         return null;
      }

      @Override
      protected void onPostExecute(Void aVoid) {
         super.onPostExecute(aVoid);
         TextView info = findViewById(R.id.info);
         info.setText("DONE");
      }
   }
}
