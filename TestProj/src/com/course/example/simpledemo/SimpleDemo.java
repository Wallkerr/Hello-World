package com.course.example.simpledemo;





import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class SimpleDemo extends Activity {

	private TextView text =(TextView)findViewById(R.id.TextView01);
	Typeface myNewFace=Typeface.createFromAsset(getAssets(),	
			 "fonts/Jokerman.TTF");

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main); 
		/*
		TextView text =(TextView)findViewById(R.id.TextView01);
		Typeface myNewFace=Typeface.createFromAsset(getAssets(),	
				 "fonts/Jokerman.TTF");
		
		*/
		//set color from /res/values/
		
		text.setTypeface(myNewFace);
		
		int color = getResources().getColor(R.color.red);
		text.setTextColor(color);
				
		//set type size from /res/values/
		float size = getResources().getDimension(R.dimen.textsize);
		text.setTextSize(size);
		
		/*
		
		associates UI with an activity. can also change UI within activity
		R.layout.main
		
		R = class
		.layout = inner class
		.main = object
		
		in res >>> drawable file = hdmpi / ldpi / mdpi == high pixe; /low pixel / medium pixel
		
		
		xml layouts have to be connected to java
		
		when setcontent view is called, Java creates an object from xml file (inflated file)
		
		<!--   in layout= wrap content = take as much height as needed, due to wrap content -->

		<!-- in fill parent = takes entire parent space-->
		
		R class created by SDK. NEVER USER MODIFY
		*/
		// connect variable to the TextView in main.xml
		
	}

	// Activity method listening for keystrokes
	// Return true if handled, false if not 
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		super.onKeyDown(keyCode, event);
		
		
		
		
		
		switch (keyCode) {		
		
	 
		
case KeyEvent.KEYCODE_A:
			
	
	
		
			
			text.setText(text.getText() + "A" );
			
			break;
case KeyEvent.KEYCODE_B:
	
	
	text.setText(text.getText() + "B" );
	
	break;
	
case KeyEvent.KEYCODE_C:
	
	text.setText(text.getText() + "C" );
	
	break;
	
case KeyEvent.KEYCODE_D:
	
	text.setText(text.getText() + "D" );
	
	break;
	
case KeyEvent.KEYCODE_E:
	
	text.setText(text.getText() + "E" );
	
	break;
	
case KeyEvent.KEYCODE_F:
	
	text.setText(text.getText() + "F" );
	
	break;
	
case KeyEvent.KEYCODE_G:
	
	text.setText(text.getText() + "G" );
	
	break;
	
case KeyEvent.KEYCODE_H:
	
	text.setText(text.getText() + "H" );
	
	break;
	
case KeyEvent.KEYCODE_I:
	
	text.setText(text.getText() + "I" );
	
	break;
	
case KeyEvent.KEYCODE_J:
	
	text.setText(text.getText() + "J" );
	
	break;
	
case KeyEvent.KEYCODE_K:
	
	text.setText(text.getText() + "K" );
	
	break;
	
case KeyEvent.KEYCODE_L:
	
	text.setText(text.getText() + "L" );
	break;
	
case KeyEvent.KEYCODE_M:
	
	text.setText(text.getText() + "M" );
	
	break;
	
case KeyEvent.KEYCODE_N:
	
	text.setText(text.getText() + "N" );
	
	break;
	
case KeyEvent.KEYCODE_O:
	
	text.setText(text.getText() + "O" );
	
	break;
	
case KeyEvent.KEYCODE_P:
	
	text.setText(text.getText() + "P" );
	
	break;
	
case KeyEvent.KEYCODE_Q:
	
	text.setText(text.getText() + "Q" );
	
	break;
	
case KeyEvent.KEYCODE_R:
	
	text.setText(text.getText() + "R" );
	
	break;
	
case KeyEvent.KEYCODE_S:
	
	text.setText(text.getText() + "S" );
	
	break;
	
case KeyEvent.KEYCODE_T:
	
	text.setText(text.getText() + "T" );
	
	break;
	
case KeyEvent.KEYCODE_U:
	
	text.setText(text.getText() + "U" );
	
	break;
	
case KeyEvent.KEYCODE_V:
	
	text.setText(text.getText() + "V" );
	
	break;
	
case KeyEvent.KEYCODE_W:
	
	text.setText(text.getText() + "W" );
	
	break;
		
		case KeyEvent.KEYCODE_X:
			
			text.setText(text.getText() + "X" );
			
			break;
			
		case KeyEvent.KEYCODE_Y:
			
			text.setText(text.getText() + "Y" );
			
			break;
		case KeyEvent.KEYCODE_Z:
			
			text.setText(text.getText() + "Z" );
			
			break;
			
		case KeyEvent.KEYCODE_DEL:
			
			
			String str = text.getText().toString();


			   if(str.length()!=0){
			    str  = str.substring( 0, str.length() - 1 ); 

			    text.setText ( str );
			}
			
					
		//text.getText().toString().substring(0, text.length()));
			
			break;
			
		case KeyEvent.KEYCODE_SPACE:
			
			text.setText(text.getText() + " " );
			
			
		default:
			return true;
		}
		return true;
	}

}