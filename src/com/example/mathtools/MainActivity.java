package com.example.mathtools;


import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Pattern;
import com.example.mathtools.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.*;





public class MainActivity extends Activity implements OnClickListener{
	
	static String viewhistory;
	private boolean isEqual;
	private boolean isContue;
	private String num;
	private String views;
	private String lastone;	
	private int brackets;
	private Vector<String> cals;
	private Vector<String> history;
	private TextView text_view;
	private TextView text_viewhistory;
	private Button button_0;
	private Button button_1;
	private Button button_2;
	private Button button_3;
	private Button button_4;
	private Button button_5;
	private Button button_6;
	private Button button_7;
	private Button button_8;
	private Button button_9;
	private Button button_point;
	private Button button_sqrt;
	private Button button_equal;
	private Button button_c;
	private Button button_del;
	private Button button_square;
	private Button button_div;
	private Button button_mul;
	private Button button_add;
	private Button button_sub;
	private Button button_mod;
	private Button button_bracket;
	private Button button_opposite;
	private Button button_ce;
	private TextView titleEdit;
	private Button titleBack;
	private Button titleAbout;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        LogUtil.d("tag", "debug log");
        text_view=(TextView) findViewById(R.id.text_view);
        text_viewhistory=(TextView) findViewById(R.id.text_viewhistory);
    	button_0=(Button) findViewById(R.id.button_0);
    	button_1=(Button) findViewById(R.id.button_1);
    	button_2=(Button) findViewById(R.id.button_2);
    	button_3=(Button) findViewById(R.id.button_3);
    	button_4=(Button) findViewById(R.id.button_4);
    	button_5=(Button) findViewById(R.id.button_5);
    	button_6=(Button) findViewById(R.id.button_6);
    	button_7=(Button) findViewById(R.id.button_7);
    	button_8=(Button) findViewById(R.id.button_8);
    	button_9=(Button) findViewById(R.id.button_9);
    	button_point=(Button) findViewById(R.id.button_point);
    	button_sqrt=(Button) findViewById(R.id.button_sqrt);
    	button_equal=(Button) findViewById(R.id.button_equal);
    	button_c=(Button) findViewById(R.id.button_c);
    	button_del=(Button) findViewById(R.id.button_del);
    	button_square=(Button) findViewById(R.id.button_square);
    	button_div=(Button) findViewById(R.id.button_div);
    	button_mul=(Button) findViewById(R.id.button_mul);
    	button_add=(Button) findViewById(R.id.button_add);
    	button_sub=(Button) findViewById(R.id.button_sub);
    	button_mod=(Button) findViewById(R.id.button_mod);
    	button_opposite=(Button) findViewById(R.id.button_opposite);
    	button_ce=(Button) findViewById(R.id.button_ce);
    	button_bracket=(Button) findViewById(R.id.button_bracket);
    	titleBack=(Button) findViewById(R.id.title_back);
		titleEdit=(TextView) findViewById(R.id.title_text);
		titleAbout=(Button) findViewById(R.id.title_about);
    	button_0.setOnClickListener(this);
    	button_1.setOnClickListener(this);
    	button_2.setOnClickListener(this);
    	button_3.setOnClickListener(this);
    	button_4.setOnClickListener(this);
    	button_5.setOnClickListener(this);
    	button_6.setOnClickListener(this);
    	button_7.setOnClickListener(this);
    	button_8.setOnClickListener(this);
    	button_9.setOnClickListener(this);
    	button_point.setOnClickListener(this);
    	button_sqrt.setOnClickListener(this);
    	button_equal.setOnClickListener(this);
    	button_c.setOnClickListener(this);
    	button_del.setOnClickListener(this);
    	button_square.setOnClickListener(this);
    	button_div.setOnClickListener(this);
    	button_mul.setOnClickListener(this);
    	button_add.setOnClickListener(this);
    	button_sub.setOnClickListener(this);
    	button_mod.setOnClickListener(this);
    	button_opposite.setOnClickListener(this);
    	button_bracket.setOnClickListener(this);
    	button_mod.setOnClickListener(this);
    	button_ce.setOnClickListener(this);
    	text_view.setOnClickListener(this);
    	text_viewhistory.setOnClickListener(this);
		titleBack.setOnClickListener(this);
		titleEdit.setOnClickListener(this);
		titleAbout.setOnClickListener(this);
        cals=new Vector<String>();
        history=new Vector<String>();
        brackets=0;
        isEqual=false;
        isContue=false;
        num="";
        lastone="";
        views="";
        viewhistory="";
    }
    
    @Override
    public void onClick(View v){
    	switch(v.getId()){
    	case R.id.button_0:onClickNum("0");break;
    	case R.id.button_1:onClickNum("1");break;
    	case R.id.button_2:onClickNum("2");break;
    	case R.id.button_3:onClickNum("3");break;
    	case R.id.button_4:onClickNum("4");break;
    	case R.id.button_5:onClickNum("5");break;
    	case R.id.button_6:onClickNum("6");break;
    	case R.id.button_7:onClickNum("7");break;
    	case R.id.button_8:onClickNum("8");break;
    	case R.id.button_9:onClickNum("9");break;
    	case R.id.button_point:onClickPoint();break;
    	case R.id.button_sqrt:onClickSqrt();break;
    	case R.id.button_equal:onClickEqual();break;
    	case R.id.button_c:onClickC("");break;
    	case R.id.button_del:onClickDel();break;
    	case R.id.button_div:onClickDiv();break;
    	case R.id.button_mul:onClickMul();break;
    	case R.id.button_add:onClickAdd();break;
    	case R.id.button_sub:onClickSub();break;
    	case R.id.button_square:onClickSquare();break;
    	case R.id.button_mod:onClickMod();break;
    	case R.id.button_bracket:onClickBracket();break;
    	case R.id.button_opposite:onClickOpposite();break;
    	case R.id.button_ce:onClickCe();break;
    	case R.id.text_view:
    	case R.id.text_viewhistory:toHistory();break; 
    	case R.id.title_about:AboutActivity.actionStart(MainActivity.this);break;
    	case R.id.title_back:onClickBack();break;
    	case R.id.title_text:break;
    	default:break;
    	}
    }
    
    @Override
   	public boolean onKeyDown(int keyCode, KeyEvent event) {
   		if (keyCode == KeyEvent.KEYCODE_BACK) {
   			moveTaskToBack(false);
   			return true;
   		}
   		return super.onKeyDown(keyCode, event);
   	}
    
    
    void onClickNum(String d)
    {
    	if(num.length()>10)
    	{
			onClickC("Input error.");
    	}
    	else if(isEqual)
		{
			views=d;
			text_view.setText(views);
			cals.clear();
			num=d;
			isContue=true;
			isEqual=false;
		}
		else if((!num.startsWith("0"))||num.contains("."))
		{
			if((!num.isEmpty())&&((num.length()%3)==0)&&(!num.contains(".")))
			{
				flash(","+d);
			}
			else
			{
				flash(d);
			}			
			if(isContue)
			{
    			num=num+d;	
    		}
    		else
    		{
    			num=d;
    		}
			isContue=true;
		}
    }

    void onClickPoint()
    {
    	 if((!isEqual)&&(!views.equals("")))
		{
			if(views.endsWith("0")||views.endsWith("1")||views.endsWith("2")
					||views.endsWith("3")||views.endsWith("4")||views.endsWith("5")
					||views.endsWith("6")||views.endsWith("7")||views.endsWith("8")||views.endsWith("9"))
			{
				views=views+".";
				text_view.setText(views);
				num=num+".";
			}
			
		}
    }
    void onClickSqrt()
    {
    	if(!isEqual)
    	{
    		if(isContue)
    		{
    			isContue=false;
    			if(!num.equals(""))
    			{
    				cals.addElement(num);
    			}
    		}
    		if(views.isEmpty())
    		{
    			flash("√");
        		flash("(");
        		cals.addElement("√");
        		cals.addElement("(");
    		}
    		else
    		{
    			if(views.endsWith("+")||views.endsWith("-")||views.endsWith("×")
    					||views.endsWith("÷")||views.endsWith("("))
    			{
    				flash("√");
            		flash("(");
            		cals.addElement("√");
            		cals.addElement("(");
    			}
    		}
       		brackets++;	
       		num="";
    	}
    	else 
    	{
    		views="";
			text_view.setText(views);
			isEqual=false;
    	}   	
    }
    
    void onClickEqual()
    {
    	if(isContue||views.endsWith("^2")||views.endsWith(")"))
		{
    		if(isContue)
    		{
    			isContue=false;
    			if(num!="")
    			{
    				cals.addElement(num);
    			}  
    		}		
			while(brackets>0)
			{
				flash(")");
				cals.addElement(")");
				brackets--;
			}
			lastone=views;
			num="";
			getResult();
			num=views;
			if(!num.equals(""))
			{
				lastone=lastone+"="+num;
				text_viewhistory.setText(lastone);
				history.addElement(lastone);
				isEqual=true;
			}
		}
    }
    
    void onClickC(String s)
    {
    	views="";
		text_view.setText(s);
		brackets=0;
		cals.clear();
		isEqual=false;
		isContue=false;
		num="";
    }
    
    void onClickDel()
    {
    	if(!views.equals(""))
		{
    		views=views.substring(0, views.length()-1);
			if(views.endsWith("^"))
			{
				views=views.substring(0, views.length()-1);
				text_view.setText(views);
				cals.removeElementAt(cals.size()-1);
			}
			else if(isEqual)
    		{
				num="";
				views=num;
				text_view.setText(views);
    			isEqual=false;
    		}
			else if(isContue)
			{
				num=views;
				text_view.setText(views);
			}
			else
			{
				text_view.setText(views);
				cals.removeElementAt(cals.size()-1);
			}    			
		}
    }
    
    void onClickCe()
    {
    	if(!num.isEmpty())
		{
			views=views.substring(0,views.lastIndexOf(num));
			text_view.setText(views);
			num="";
		}
    }
    
    void onClickDiv()
    {
    	if(isContue)
		{
			isContue=false;
			if(!num.equals(""))
			{
				cals.addElement(num);
			}
		}
		if(!views.equals(""))
		{
			if(views.endsWith("0")||views.endsWith("1")||views.endsWith("2")
					||views.endsWith("3")||views.endsWith("4")||views.endsWith("5")
					||views.endsWith("6")||views.endsWith("7")||views.endsWith("8")||views.endsWith("9")
					||views.endsWith("^2")||views.endsWith(")"))
			{
				flash("÷");
				cals.addElement("/");
			}
		}
		if(isEqual)
		{
			isEqual=false;
		}		
		num="";
    }
    
    void onClickMul()
    {
    	if(isContue)
		{
			isContue=false;
			if(!num.equals(""))
			{
				cals.addElement(num);
			}
		}
		if(!views.equals(""))
		{
			if(views.endsWith("0")||views.endsWith("1")||views.endsWith("2")
					||views.endsWith("3")||views.endsWith("4")||views.endsWith("5")
					||views.endsWith("6")||views.endsWith("7")||views.endsWith("8")||views.endsWith("9")
					||views.endsWith("^2")||views.endsWith(")"))
			{
				flash("×");
				cals.addElement("*");
			}
		}  
		if(isEqual)
		{
			isEqual=false;
		}
		num="";
    }
    
    void onClickAdd()
    {
    	if(isContue)
		{
			isContue=false;
			if(!num.equals(""))
			{
				cals.addElement(num);
			}
		}
		if(!views.equals(""))
		{
			if(views.endsWith("0")||views.endsWith("1")||views.endsWith("2")
					||views.endsWith("3")||views.endsWith("4")||views.endsWith("5")
					||views.endsWith("6")||views.endsWith("7")||views.endsWith("8")||views.endsWith("9")
					||views.endsWith("^2")||views.endsWith(")"))
			{
				flash("+");
				cals.addElement("+");
			}
		}
		if(isEqual)
		{
			isEqual=false;
		}	
		num="";
    }
    
    void onClickSub()
    {
    	if(isContue)
		{
			isContue=false;
			if(!num.equals(""))
			{
				cals.addElement(num);
			}
		}
		if(views.equals(""))
		{
			flash("-");
			cals.addElement("0");
			cals.addElement("-");
		}
		else
		{
			if(views.endsWith("0")||views.endsWith("1")||views.endsWith("2")
					||views.endsWith("3")||views.endsWith("4")||views.endsWith("5")
					||views.endsWith("6")||views.endsWith("7")||views.endsWith("8")||views.endsWith("9")
					||views.endsWith("^2")||views.endsWith(")"))
			{
				flash("-");
				cals.addElement("-");
			}
		}  
		if(isEqual)
		{
			isEqual=false;
		}
		num="";
    }
    
    void onClickSquare()
    {
    	if(isContue)
		{
			isContue=false;
			if(!num.isEmpty())
			{
				cals.addElement(num);
				cals.addElement("^2");
				int i=num.length();
				if(!num.contains("."))
				{
					i=i+(i-1)/3;
				}
				else if(num.indexOf(".")!=1)
				{
					i=i+(num.substring(0, num.lastIndexOf(".")).length()-1)/3;
				}
				i=views.length()-i;
				if(i==0)
				{
					views="";
				}
				else
				{
					views=views.substring(0,i);
				}
				flash("("+num+")"+"^2");
			}
		}
    	else if(isEqual)
    	{
    		views="("+num+")"+"^2";
    		text_view.setText(views);
    		cals.addElement("^2");
    		isEqual=false;
    	}
    	else if(views.endsWith(")"))
		{
			flash("^2");
			cals.addElement("^2");
		}
		num="";
    }
    
    void onClickMod()
    {
    	if(isContue)
		{
			isContue=false;
			if(!num.equals(""))
			{
				cals.addElement(num);
			}		
		}
		if(!views.equals(""))
		{
			if(views.endsWith("0")||views.endsWith("1")||views.endsWith("2")
					||views.endsWith("3")||views.endsWith("4")||views.endsWith("5")
					||views.endsWith("6")||views.endsWith("7")||views.endsWith("8")||views.endsWith("9")
					||views.endsWith("^2")||views.endsWith(")"))
			{
				flash("%");
				cals.addElement("%");
			}
		}
		if(isEqual)
		{
			isEqual=false;
		}
		num="";
    }
    
    void onClickBracket()
    {
    	if(isContue)
		{
			isContue=false;
			if(!num.equals(""))
			{
				cals.addElement(num);
			}
		}
		if(brackets>13)
		{
			onClickC("Input error.");
		}
		if(views.equals(""))
		{
			flash("(");
			cals.addElement("(");
			brackets++;
		}
		else 
		{
    		if(views.endsWith("+")||views.endsWith("-")||views.endsWith("×")
    				||views.endsWith("÷")||views.endsWith("%")||views.endsWith("√")||views.endsWith("("))
    		{
    			flash("(");
    			cals.addElement("(");
    			brackets++;
    		}
    		else if(brackets>0&&(!views.endsWith("^2")))
    		{
    			flash(")");
    			cals.addElement(")");
    			brackets--;
    		}
		}
		num="";
    }
    
    void onClickOpposite()
    {
    	if(!num.isEmpty())
		{
    		String s=views.substring(0,views.lastIndexOf(num));
    		if(s.isEmpty())
    		{
    			views="-"+num;
    			cals.insertElementAt("0", 0);
    			cals.insertElementAt("-", 1);
    		}
    		else if(s.endsWith("+"))
			{
    			views=s.substring(0, s.length()-1)+"-"+num;
    			cals.setElementAt("-", cals.size()-1);
			}
    		else if(s.endsWith("-"))
    		{
    			views=s.substring(0, s.length()-1)+"+"+num;
    			cals.setElementAt("-", cals.size()-1);
    		}
			text_view.setText(views);
		}
    }
    
    void onClickBack()
    {
    	Intent intent= new Intent();  
		intent.setAction(Intent.ACTION_MAIN);  
		intent.addCategory(Intent.CATEGORY_HOME); 
		startActivity(intent);
    }
    
    void toHistory()
    {
    	for(String s:history)
		{
			viewhistory=viewhistory+s+"\n";
		}
		ViewHistory.actionStart(MainActivity.this, viewhistory);
		viewhistory="";
    }
    
   
    void flash(String output)
    {   
    	views=views+output;
		text_view.setText(views);  	
    }
    
    void getResult()
    {
    	cals.addElement("#");
    	Calculate result=new Calculate(cals);
    	views=result.getV();
    	cals.clear();
    	if(views.length()>10)
    	{
    		text_view.setText("Input error.");
    		views="";
    	}
    	else
    	{
    		text_view.setText(views);
    		if(views.equals("除数不能为0."))
    		{
    			views="";
    		}
    		else if(views.equals("Input error."))
    		{
    			views="";
    		}
    		else 
    		{
    			Pattern p=Pattern.compile("[,]+");
    			String[] s=p.split(views);
    			for(String s0:s)
    			{
    				num=num+s0;
    			}
    			cals.addElement(num);
    		}
    	}    			
    }
}

 class Calculate
{
	private Stack<String> op;
	private  Stack<String> num;
	private String v;
	boolean goon;
	Calculate(Vector<String> cals)
	{
		op=new Stack<String>();
		num=new Stack<String>();
		String s;
		goon=true;
		op.push("#");
		Iterator<String> it=cals.iterator();
		s=it.next().toString();
		while(goon&&((!s.equals("#"))||(!op.peek().equals("#"))))
		{	
			if(s.equals("^2"))
			{
				double s2=Double.parseDouble(num.pop());
				num.push(String.valueOf(s2*s2));
				s=it.next().toString();
			}
			else if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("√")
					||s.equals("%")||s.equals("(")||s.equals(")")||s.equals("#"))
			{
				switch(Compare(op.peek(),s))
				{
				case -1:
					op.push(s);
					s=it.next().toString();break;
				case 0:
					op.pop();
					if(op.peek().equals("√"))
					{
						double s2=Double.parseDouble(num.pop());
						num.push(String.valueOf(Math.sqrt(s2)));
						op.pop();
					}
					s=it.next().toString();break;
				case 1:
					num.push(Execute(num.pop(),op.pop(),num.pop()));
					if(num.peek().equals("除数不能为0."))
					{
						goon=false;
					}break;
				case 2:
					goon=false;
					num.push("Input error.");
				}				
			}
			else
			{
				num.push(s);
				s=it.next().toString();
			}
		}
		v=num.peek();
	}
	
	
	private int Compare(String op1,String op2)
	{
		String[] operator={"+","-","*","/","(",")","^2","√","%","#"};
		int oppgg[][]={
				{1,1,-1,-1,-1,1,-1,-1,-1,1},
				{1,1,-1,-1,-1,1,-1,-1,-1,1},
				{1,1,1,1,-1,1,-1,-1,1,1},
				{1,1,1,1,-1,1,-1,-1,1,1},
				{-1,-1,-1,-1,-1,0,-1,-1,-1,-1},
				{1,1,1,1,2,1,1,1,1,1},
				{1,1,1,1,-1,1,1,2,1,1},
				{1,1,1,1,-1,1,-1,2,1,1},
				{1,1,1,1,-1,1,-1,-1,1,1},
				{-1,-1,-1,-1,-1,2,-1,-1,-1,0}};
		int opg1=0;
		int opg2=0;
		boolean flag=false;
		for(int i=0;i<10;i++)
		{
			if((!flag)&&op1.equals(operator[i]))
			{
				opg1=i;
				flag=true;
			}
			if(op2.equals(operator[i]))
			{
				opg2=i;
			}
		}
		return oppgg[opg1][opg2];
	}
	
	private String Execute(String b,String op,String a)
	{
		String[] operator={"+","-","*","/","(",")","^2","√","%","#"};
		int  i;
		String v="";
		double ad=Double.parseDouble(a),bd=Double.parseDouble(b);
		for(i=0;i<10;i++)
		{
			if(op.equals(operator[i]))
			{
				break;
			}
		}
		switch(i)
		{
		case 0:v=String.valueOf(ad+bd);break;
		case 1:v=String.valueOf(ad-bd);break;
		case 2:v=String.valueOf(ad*bd);break;
		case 3:
			if(bd!=0)
			{
				v=String.valueOf(ad/bd);			
			}
			else
			{
				v="除数不能为0.";
			}break;
		case 4:break;
		case 5:break;
		case 6:break;
		case 7:break;
		case 8:v=String.valueOf(ad%bd);break;
		case 9:break;
		}
		return v;
	}
	
	String getV()
	{
		if(!v.contains("."))
		{
			return v;
		}
		else if(v.equals("Input error."))
		{
			return "Input error.";
		}
		else if(v.equals("除数不能为0."))
		{
			return "除数不能为0.";			
		}
		else 
		{
			NumberFormat ddf=NumberFormat.getNumberInstance() ;
			ddf.setMaximumFractionDigits(10);
			return ddf.format(Double.parseDouble(v));
		}
	}
}

