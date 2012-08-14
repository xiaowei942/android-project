package wei.apps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class SecondApp extends Activity implements View.OnClickListener
{
	Button btn;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
        updateTime();
    }
    
    public void onClick(View view){
    	updateTime();
    }
    
    private void updateTime(){
    	btn.setText(new Date().toLocaleString());
    }
}
