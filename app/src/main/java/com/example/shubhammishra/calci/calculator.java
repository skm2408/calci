package com.example.shubhammishra.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Stack;

public class calculator extends AppCompatActivity {
    EditText ed1;
    double memory_val=0;
    Button bt[]=new Button[23];
    int arr[];

    {
        arr = new int[10000];
    }
    private static double calculate(char ope, double val1, double val2) {
        if(ope=='+')
        {
            return val2+val1;
        }
        else if(ope=='-')
        {
            return val2-val1;
        }
        else if(ope=='*')
        {
            return val2*val1;
        }
        else if(ope=='/')
        {
            return val2/val1;
        }
        return 0;
    }

    private static boolean hasPrecedence(char ch, char peek) {
        if(ch=='('&&peek==')')
            return false;
        else if((ch=='+'||ch=='-')&&(peek=='*'||peek=='/'))
        {
            return false;
        }
        else if((ch=='+'&&peek=='-')||(ch=='-'&&peek=='+'))
            return false;
        else if((ch=='*'&&peek=='/')||(ch=='/'&&peek=='*'))
            return false;
        return true;
    }
    private int findFact(int val,int x) {
        int m=val,i=x;
        int carry=0;
        for(int j=0;j<i;j++)
        {
            int product=arr[j]*val+carry;
            arr[j]=product%10;
            carry=product/10;
        }
        while(carry!=0)
        {
            arr[i++]=carry%10;
            carry=carry/10;
        }
        return i;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ed1=findViewById(R.id.editText);
        bt[0]=findViewById(R.id.button2);
        bt[1]=findViewById(R.id.button3);
        bt[2]=findViewById(R.id.button4);
        bt[3]=findViewById(R.id.button5);
        bt[4]=findViewById(R.id.button6);
        bt[5]=findViewById(R.id.button7);
        bt[6]=findViewById(R.id.button8);
        bt[7]=findViewById(R.id.button9);
        bt[8]=findViewById(R.id.button10);
        bt[9]=findViewById(R.id.button11);
        bt[10]=findViewById(R.id.button12);
        bt[11]=findViewById(R.id.button13);
        bt[12]=findViewById(R.id.button14);
        bt[13]=findViewById(R.id.button15);
        bt[14]=findViewById(R.id.button16);
        bt[15]=findViewById(R.id.button17);
        bt[16]=findViewById(R.id.button18);
        bt[17]=findViewById(R.id.button19);
        bt[18]=findViewById(R.id.button);
        bt[19]=findViewById(R.id.button20);
        bt[20]=findViewById(R.id.button21);
        bt[21]=findViewById(R.id.button22);
        bt[22]=findViewById(R.id.button23);
        bt[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(String.valueOf(ed1.getText()).matches("")==false) {
                    String val = String.valueOf(ed1.getText());
                    ed1.setText(val.substring(0, val.length() - 1));
                }
            }
        });
        bt[4].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String val = String.valueOf(ed1.getText());
                if(val.equals("")==true) {
                    {
                        ed1.setText(String.valueOf(ed1.getText()) + "9");
                        ed1.setSelection(ed1.getText().length());
                    }
                }
                else if(val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"9");
                 ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = String.valueOf(ed1.getText());
                if(val.equals("")==true)
                {
                    {ed1.setText(String.valueOf(ed1.getText())+"8");
                        ed1.setSelection(ed1.getText().length());
                    }
                }
                else if(val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"8");
                ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val = String.valueOf(ed1.getText());
                if(val.equals("")==true) {
                    {
                        ed1.setText(String.valueOf(ed1.getText()) + "7");
                        ed1.setSelection(ed1.getText().length());
                    }
                }
                else if(val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"7");
                ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = String.valueOf(ed1.getText());
                if(val.equals("")==true) {
                    {
                        ed1.setText(String.valueOf(ed1.getText()) + "6");
                        ed1.setSelection(ed1.getText().length());
                    }
                }
                else if(val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"6");
                ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = String.valueOf(ed1.getText());
                if(val.equals("")==true) {
                    {
                        ed1.setText(String.valueOf(ed1.getText()) + "5");
                        ed1.setSelection(ed1.getText().length());
                    }
                }
                else if(val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"5");
                ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = String.valueOf(ed1.getText());
                if(val.equals("")==true) {
                    {
                        ed1.setText(String.valueOf(ed1.getText()) + "4");
                        ed1.setSelection(ed1.getText().length());
                    }
                }
                else if(val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"4");
                ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = String.valueOf(ed1.getText());
                if(val.equals("")==true)
                {
                    {ed1.setText(String.valueOf(ed1.getText())+"3");
                        ed1.setSelection(ed1.getText().length());
                    }
                }
                else if(val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"3");
                ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = String.valueOf(ed1.getText());
                    if(val.equals("")==true) {
                        {
                            ed1.setText(String.valueOf(ed1.getText()) + "2");
                            ed1.setSelection(ed1.getText().length());
                        }
                    }
                else if(val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"2");
                ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = String.valueOf(ed1.getText());
                if(val.equals("")==true) {
                    {
                        ed1.setText(String.valueOf(ed1.getText()) + "1");
                        ed1.setSelection(ed1.getText().length());
                    }
                }
                else if(val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"1");
                ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = String.valueOf(ed1.getText());
                if(val.equals("")==true)
                {
                    {ed1.setText(String.valueOf(ed1.getText())+"0");
                        ed1.setSelection(ed1.getText().length());
                }
                }
                else if(!val.equals("") &&val.charAt(val.length()-1)!='!')
                {ed1.setText(String.valueOf(ed1.getText())+"0");
                ed1.setSelection(ed1.getText().length());}
            }
        });
        bt[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(String.valueOf(ed1.getText()).equals("")==false) {
                    String val=ed1.getText().toString();
                    if(val.charAt(val.length()-1)!='+'&&val.charAt(val.length()-1)!='-'&&val.charAt(val.length()-1)!='*'&&val.charAt(val.length()-1)!='/'&&val.charAt(val.length()-1)!='!'&&val.charAt(val.length()-1)!='√'&& val.charAt(0)!='√'&&val.charAt(val.length()-1)!='.')
                    ed1.setText(String.valueOf(ed1.getText())+"+");
                }
            }
        });
        bt[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(String.valueOf(ed1.getText()).equals("")==false) {
                    String val=ed1.getText().toString();
                  //  if(val.charAt(val.length()-1)!='+'&&val.charAt(val.length()-1)!='-'&&val.charAt(val.length()-1)!='*'&&val.charAt(val.length()-1)!='/'&&val.charAt(val.length()-1)!='!'&&val.charAt(val.length()-1)!='√'&& val.charAt(0)!='√'&&val.charAt(val.length()-1)!='.')
                    ed1.setText(String.valueOf(ed1.getText())+"-");
                //}
            }
        });
        bt[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(String.valueOf(ed1.getText()).equals("")==false) {
                    String val=ed1.getText().toString();
                    if(val.charAt(val.length()-1)!='+'&&val.charAt(val.length()-1)!='-'&&val.charAt(val.length()-1)!='*'&&val.charAt(val.length()-1)!='/'&&val.charAt(val.length()-1)!='!'&&val.charAt(val.length()-1)!='√'&& val.charAt(0)!='√'&&val.charAt(val.length()-1)!='.')
                    ed1.setText(String.valueOf(ed1.getText())+"*");
                }
            }
        });
        bt[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(String.valueOf(ed1.getText()).equals("")==false) {
                    String val=ed1.getText().toString();
                    if(val.charAt(val.length()-1)!='+'&&val.charAt(val.length()-1)!='-'&&val.charAt(val.length()-1)!='*'&&val.charAt(val.length()-1)!='/'&&val.charAt(val.length()-1)!='!'&&val.charAt(val.length()-1)!='√'&& val.charAt(0)!='√'&&val.charAt(val.length()-1)!='.')
                    ed1.setText(String.valueOf(ed1.getText())+"/");
                }
            }
        });
        bt[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(String.valueOf(ed1.getText()).equals("")==false) {
                    String exp=String.valueOf((String.valueOf(ed1.getText())));
                    Stack<Double> operands=new Stack<>();
                    Stack<Character> operator=new Stack<>();
                    double val=0,result=0;
                    String res="";
                    int i=0;
                    while(i<exp.length())
                    {
                        char ch=exp.charAt(i);
                        if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
                        {
                            if(res.equals("")==false)
                            {val=Double.parseDouble(res);
                                operands.push(val);}
                            res="";
                            if(!operator.isEmpty())
                            {
                                if(hasPrecedence(ch,operator.peek())==false)
                                {
                                    while(!operator.isEmpty()&&hasPrecedence(ch,operator.peek())==false)
                                    {
                                        double val1=operands.pop();
                                        double val2=operands.pop();
                                        char ope=operator.pop();
                                        result=calculate(ope,val1,val2);
                                        operands.push(result);
                                    }
                                    if(operator.isEmpty()||hasPrecedence(ch,operator.peek()))
                                    {
                                        operator.push(ch);
                                    }
                                }
                                else
                                {
                                    operator.push(ch);
                                }
                            }
                            else
                            {
                                operator.push(ch);
                            }
                        }
                        else if(ch==')')
                        {
                            if(res.equals("")==false)
                            {
                                operands.push(Double.parseDouble(res));
                                res="";
                            }
                            while(!operator.isEmpty()&&operator.peek()!='(')
                            {
                                double val1=operands.pop();
                                double val2=operands.pop();
                                char ope=operator.pop();
                                result=calculate(ope,val1,val2);
                                operands.push(result);
                            }
                            if(operator.peek()=='(')
                                operator.pop();
                        }
                        else if(ch=='(')
                        {
                            if(res.equals("")==false)
                            {
                                operands.push(Double.parseDouble(res));
                            }
                            operator.push('(');
                            res="";
                        }
                        else
                        {
                            res+=ch;
                            if(i==exp.length()-1&&res.equals("")==false)
                            {
                                operands.push(Double.parseDouble(res));
                            }
                        }
                        i++;
                    }
                    while(!operator.isEmpty())
                    {
                        if(operator.peek()==')')
                            while(!operator.isEmpty()&&operator.peek()!='(')
                            {
                                double val1=operands.pop();
                                double val2=operands.pop();
                                char ope=operator.pop();
                                result=calculate(ope,val1,val2);
                                operands.push(result);
                            }
                        else { double val1=0,val2=0;
                            val1=operands.pop();
                            val2=operands.pop();
                            char ope=operator.pop();
                            result=calculate(ope,val1,val2);
                            operands.push(result);
                        }
                    }
                    ed1.setText(result+"");

            }
            }
        });
        bt[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=ed1.getText().toString();
                if(val.equals("")==false){
                if(val.charAt(val.length()-1)!='+'&&val.charAt(val.length()-1)!='-'&&val.charAt(val.length()-1)!='*'&&val.charAt(val.length()-1)!='/'&&val.charAt(val.length()-1)!='!'&&val.charAt(val.length()-1)!='√'&&val.charAt(val.length()-1)!='.'&&val.indexOf(".")<0) {
                    ed1.setText(String.valueOf(ed1.getText()) + ".");
                    ed1.setSelection(ed1.getText().length());
                }
            }
            }
        });
         bt[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("")==false)
                {
                    String val=ed1.getText().toString();
                    if(val.charAt(val.length()-1)!='+'&&val.charAt(val.length()-1)!='-'&&val.charAt(val.length()-1)!='*'&&val.charAt(val.length()-1)!='/'&&val.charAt(val.length()-1)!='!'&&val.charAt(val.length()-1)!='√'&& val.charAt(0)!='√'&&val.indexOf('.')<0)
                    ed1.setText(ed1.getText().toString()+"!");
                }}
            });
         bt[2].setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(ed1.getText().toString().equals("")==false)
                 {   String val=ed1.getText().toString();
                     if(val.charAt(val.length()-1)!='+'&&val.charAt(val.length()-1)!='-'&&val.charAt(val.length()-1)!='*'&&val.charAt(val.length()-1)!='/'&&val.charAt(val.length()-1)!='!'&&val.charAt(val.length()-1)!='√'&& val.charAt(0)!='√'&&val.charAt(val.length()-1)!='.')
                     ed1.setText("√"+ed1.getText().toString());
                 }
             }
         });
         bt[0].setOnLongClickListener(new View.OnLongClickListener() {
             @Override
             public boolean onLongClick(View v) {
                 ed1.setText("");
                 memory_val=0;
                 return true;
             }
         });
         bt[19].setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(ed1.getText().toString().equals("")==false) {
                     if(ed1.getText().toString().matches("^[0-9.-]+$")==true){
                         memory_val = Double.parseDouble(String.valueOf(ed1.getText()));
                         ed1.setText("");
                     }
                 }
             }
         });
         bt[20].setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String val=String.valueOf(ed1.getText());
                 if(val.equals("")==false)
                 {
                     ed1.setText(val+"+"+memory_val);
                 }
             }
         });
         bt[21].setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String val=String.valueOf(ed1.getText());
                 if(val.equals("")==false)
                 {
                     ed1.setText(val+"-"+memory_val);
                 }
             }
         });
         bt[22].setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ed1.setText(memory_val+"");
             }
         });
    }
}