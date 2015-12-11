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
			about_tips.setText("Welcome to use this calculator\n�������ѯ����\nRascalZem�Ĳ������ԡ�\nThank you!\n"+
											"~~~Tips~~~\n1�������ʾ���ȡ��ʷ��¼��\n"+
											"2�����ܻ����Ż����У���ӭ����\n" +
											"3��Input error������λ������ʮλ�����ų���13�����������������ʱ���֡�\n"+
											"4������·����ַ��ء�\n�Ұ��㣬�����޹�\n"+
										"�����ز�ס�۹�\n�����Ҷ㿪\n��Ҫ�㿴�����Ļ�\n�Ұ��㣬�����޹�\n��İ�\n"+
										"��ֻ�����ҵ���\nֻҪ�����Ҹ�\n�ҵı���\n�㲻��Ҫ��\n~~~~~~~");
		}
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();		
		}
}
