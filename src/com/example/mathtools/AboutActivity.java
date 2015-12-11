package com.example.mathtools;

import com.example.mathtools.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class AboutActivity extends Activity implements OnClickListener
{
		private TextView about_tips;
		public static  void actionStart(Context context)
		{
			Intent intent=new Intent(context,AboutActivity.class);
			context.startActivity(intent);
		}
		@Override
		protected  void onCreate(Bundle savedInstanceState)
		{
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.about_layout);
			about_tips=(TextView)  findViewById(R.id.about_tips);
			about_tips.setOnClickListener(this);
			about_tips.setText("Welcome to use this calculator\n报错和咨询请在\nRascalZem的博客留言。\nThank you!\n"+
											"~~~Tips~~~\n1、点击显示框获取历史纪录。\n"+
											"2、功能还在优化当中，欢迎报错。\n" +
											"3、Input error在输入位数超过十位或括号超过13个或输入运算符错误时出现。\n"+
											"4、点击下方文字返回。\n我爱你，与你无关\n"+
										"渴望藏不住眼光\n于是我躲开\n不要你看见我心慌\n我爱你，与你无关\n真的啊\n"+
										"它只属于我的心\n只要你能幸福\n我的悲伤\n你不需要管\n~~~~~~~");
		}
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();		
		}
}
