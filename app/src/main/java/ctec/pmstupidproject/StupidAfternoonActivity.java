package ctec.pmstupidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class StupidAfternoonActivity extends AppCompatActivity
{
    private Button corChangeButton;
    private RelativeLayout background;
    private TextView;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid_afternoon);

        colorChangeButton = (Button) findViewById(R.id.sillyButton);
            background = (relativeLayout) findViewById(R.id.appBackground);
            sillyWords = (TextView) findViewById(R.id.sillyWords);
    }

        private Button colorChangeButton;
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stupid_afternoon, menu);
        return true;
    }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    }
}
