package com.example.mathtools;

import com.example.mathtools.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ViewHistory extends Activity implements OnClickListener
{
	private  TextView text_viewhistorybig;
	private LinearLayout linear_layout;
	public static  void actionStart(Context context,String viewhistory)
	{
		Intent intent=new Intent(context,ViewHistory.class);
		intent.putExtra("viewhistorybig", viewhistory);
		context.startActivity(intent);
	}
	@Override
	protected  void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.history_layout);
        Intent getIntent = getIntent();        
        String va = getIntent.getStringExtra("viewhistorybig");
		text_viewhistorybig=(TextView) findViewById(R.id.text_viewhistorybig);
		linear_layout=(LinearLayout)  findViewById(R.id.linear_layout);
		text_viewhistorybig.setText(va);
		text_viewhistorybig.setOnClickListener(this);
		linear_layout.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		finish();
	}
}
