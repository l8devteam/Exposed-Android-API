package com.l8smartlight.l8remotecontrol;


import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void setMatrixColor(View view){
		Intent intent = new Intent("com.l8smartlight.action.connect",Uri.parse("l8://l8smartlight.com/setMatrixColor?color=0000ff"));
		this.startActivity(intent);
	}
	
	public void setBackLedColor(View view){
		Intent intent = new Intent("com.l8smartlight.action.connect",Uri.parse("l8://l8smartlight.com/setBackLedColor?color=ff0000"));
		this.startActivity(intent);
	}
	
	public void setLedColor(View view){
		Intent intent = new Intent("com.l8smartlight.action.connect",Uri.parse("l8://l8smartlight.com/setLedColor?x=0&y=0&color=00ff00"));
		this.startActivity(intent);
	}
	
	public void setMatrixArrayColor(View view){
		Intent intent = new Intent("com.l8smartlight.action.connect",Uri.parse("l8://l8smartlight.com/setMatrixArrayColor?matrixArray=000000-000000-000000-000000-000000-000000-000000-000000-ff0000-ff0000-ffffff-ffffff-ffffff-ffffff-ff0000-ff0000-ff0000-ff0000-ff0000-ffffff-ffffff-ff0000-ff0000-ff0000-ff0000-ffffff-ff0000-ff0000-ff0000-ff0000-ffffff-ff0000-ff0000-ffffff-ffffff-ff0000-ff0000-ffffff-ffffff-ff0000-ff0000-ffffff-ffffff-ffffff-ffffff-ffffff-ffffff-ff0000-ff0000-ffffff-ffffff-ffffff-ffffff-ffffff-ffffff-ff0000-000000-000000-000000-000000-000000-000000-000000-000000-ffffff"));
		this.startActivity(intent);
	}
	
	public void closeBtConnection(View view){
		Intent intent = new Intent("com.l8smartlight.action.connect",Uri.parse("l8://l8smartlight.com/closeBtConnection"));
		this.startActivity(intent);
	}
	
	public void clear(View view){
		Intent intent = new Intent("com.l8smartlight.action.connect",Uri.parse("l8://l8smartlight.com/clear"));
		this.startActivity(intent);
	}
	
	public void shutDown(View view){
		Intent intent = new Intent("com.l8smartlight.action.connect",Uri.parse("l8://l8smartlight.com/shutDown"));
		this.startActivity(intent);
	}
	
	public void animationTest(final View view){
		AsyncTask<Void,Void,Void> task = new AsyncTask<Void,Void,Void>(){

			@Override
			protected Void doInBackground(Void... arg0) {
				String[] logos = new String[10];
				logos[0] = "000000-000000-ffffff-ffffff-ffffff-ffffff-000000-000000-000000-ffffff-00ff00-00ff00-00ff00-00ff00-ffffff-000000-ffffff-00ff00-ffffff-ffffff-00ff00-00ff00-00ff00-ffffff-ffffff-00ff00-ffffff-00ff00-00ff00-00ff00-00ff00-ffffff-ffffff-00ff00-ffffff-ffffff-00ff00-ffffff-00ff00-ffffff-ffffff-00ff00-00ff00-ffffff-ffffff-ffffff-00ff00-ffffff-ffffff-00ff00-00ff00-00ff00-00ff00-00ff00-ffffff-000000-ffffff-ffffff-ffffff-ffffff-ffffff-ffffff-000000-000000-000000";
				logos[1] = "000000-000000-000000-000000-000000-000000-000000-000000-ff0000-ff0000-ffffff-ffffff-ffffff-ffffff-ff0000-ff0000-ff0000-ff0000-ff0000-ffffff-ffffff-ff0000-ff0000-ff0000-ff0000-ffffff-ff0000-ff0000-ff0000-ff0000-ffffff-ff0000-ff0000-ffffff-ffffff-ff0000-ff0000-ffffff-ffffff-ff0000-ff0000-ffffff-ffffff-ffffff-ffffff-ffffff-ffffff-ff0000-ff0000-ffffff-ffffff-ffffff-ffffff-ffffff-ffffff-ff0000-000000-000000-000000-000000-000000-000000-000000-000000-ffffff";
				logos[2] = "0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-0000ff-0000ff-0000ff-77A8E2";
				logos[3] = "000000-00adec-00adec-00adec-00adec-00adec-00adec-000000-00adec-00adec-ffffff-ffffff-00adec-00adec-00adec-00adec-00adec-00adec-ffffff-ffffff-ffffff-ffffff-00adec-00adec-00adec-00adec-ffffff-ffffff-ffffff-ffffff-00adec-00adec-00adec-00adec-ffffff-ffffff-00adec-00adec-00adec-00adec-00adec-00adec-ffffff-ffffff-ffffff-ffffff-00adec-00adec-00adec-00adec-00adec-ffffff-ffffff-ffffff-00adec-00adec-000000-00adec-00adec-00adec-00adec-00adec-00adec-000000-00adec";
				logos[4] = "000000-ffffff-ffffff-000000-000000-000000-000000-ffff00-ffffff-ffffff-ffffff-000000-000000-ffff00-000000-000000-ffffff-ffffff-000000-ffff00-000000-000000-ffff00-000000-ffffff-ffffff-000000-000000-ffff00-000000-ffff00-000000-ffffff-ffffff-000000-000000-ffff00-000000-ffff00-000000-ffffff-ffffff-000000-ffff00-000000-000000-ffff00-000000-ffffff-ffffff-ffffff-000000-000000-ffff00-000000-000000-000000-ffffff-ffffff-000000-000000-000000-000000-ffff00-000000";
				logos[5] = "000000-000000-ffffff-ffffff-ffffff-ffffff-000000-000000-000000-ffffff-00ff00-00ff00-00ff00-00ff00-ffffff-000000-ffffff-00ff00-ffffff-ffffff-00ff00-00ff00-00ff00-ffffff-ffffff-00ff00-ffffff-00ff00-00ff00-00ff00-00ff00-ffffff-ffffff-00ff00-ffffff-ffffff-00ff00-ffffff-00ff00-ffffff-ffffff-00ff00-00ff00-ffffff-ffffff-ffffff-00ff00-ffffff-ffffff-00ff00-00ff00-00ff00-00ff00-00ff00-ffffff-000000-ffffff-ffffff-ffffff-ffffff-ffffff-ffffff-000000-000000-000000";
				logos[6] = "000000-000000-000000-000000-000000-000000-000000-000000-ff0000-ff0000-ffffff-ffffff-ffffff-ffffff-ff0000-ff0000-ff0000-ff0000-ff0000-ffffff-ffffff-ff0000-ff0000-ff0000-ff0000-ffffff-ff0000-ff0000-ff0000-ff0000-ffffff-ff0000-ff0000-ffffff-ffffff-ff0000-ff0000-ffffff-ffffff-ff0000-ff0000-ffffff-ffffff-ffffff-ffffff-ffffff-ffffff-ff0000-ff0000-ffffff-ffffff-ffffff-ffffff-ffffff-ffffff-ff0000-000000-000000-000000-000000-000000-000000-000000-000000-ffffff";
				logos[7] = "0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-0000ff-0000ff-0000ff-0000ff-0000ff-0000ff-ffffff-ffffff-0000ff-0000ff-0000ff-77A8E2";
				logos[8] = "000000-00adec-00adec-00adec-00adec-00adec-00adec-000000-00adec-00adec-ffffff-ffffff-00adec-00adec-00adec-00adec-00adec-00adec-ffffff-ffffff-ffffff-ffffff-00adec-00adec-00adec-00adec-ffffff-ffffff-ffffff-ffffff-00adec-00adec-00adec-00adec-ffffff-ffffff-00adec-00adec-00adec-00adec-00adec-00adec-ffffff-ffffff-ffffff-ffffff-00adec-00adec-00adec-00adec-00adec-ffffff-ffffff-ffffff-00adec-00adec-000000-00adec-00adec-00adec-00adec-00adec-00adec-000000-00adec";
				logos[9] = "000000-ffffff-ffffff-000000-000000-000000-000000-ffff00-ffffff-ffffff-ffffff-000000-000000-ffff00-000000-000000-ffffff-ffffff-000000-ffff00-000000-000000-ffff00-000000-ffffff-ffffff-000000-000000-ffff00-000000-ffff00-000000-ffffff-ffffff-000000-000000-ffff00-000000-ffff00-000000-ffffff-ffffff-000000-ffff00-000000-000000-ffff00-000000-ffffff-ffffff-ffffff-000000-000000-ffff00-000000-000000-000000-ffffff-ffffff-000000-000000-000000-000000-ffff00-000000";
				
				for(String logo: logos){
					try {
						Thread.sleep(50);
						Intent intent = new Intent("com.l8smartlight.action.connect",Uri.parse("l8://l8smartlight.com/setMatrixArrayColor?matrixArray="+logo));
						startActivity(intent);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				return null;
			}
		
		};
		task.execute();
	}
	
	public void getDataSensors(View view){
		Intent intent = new Intent("com.l8smartlight.action.connect",Uri.parse("l8://l8smartlight.com/getDataSensors"));
		startActivityForResult(intent, 0);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(data!=null){
			float temperature = data.getFloatExtra("temperature", 0);
			int ambient = data.getIntExtra("ambientLight", 0);
			int proximity = data.getIntExtra("proximity", 0);
			int rawX = data.getIntExtra("axisX", 0);
			int rawY = data.getIntExtra("axisY", 0);
			int rawZ = data.getIntExtra("axisZ", 0);
			int noise = data.getIntExtra("noise", 0);
			TextView text = (TextView )findViewById(R.id.sensor_text);
			text.setText("temperature: "+temperature+" ambientLight: "+ ambient+" proximity: "+proximity+" Accelerometer(axisX: "+rawX+" axisY: "+rawY+ " axisZ: "+rawZ+ ") noise: "+noise);
		}
	}
	
	
	
	
}
