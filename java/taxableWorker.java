package moiz;

class taxableworker
{
String name;
double workrate;
double ftrate;
double ttax;
taxableworker(String n,double w,double f)
{
name=n;
workrate=w;
ftrate=f;
}
public void setworkrate(double w)
{
workrate=w;
}
public void setftrate(double f)
{
ftrate=f;
}
public String workerinfo()
{
return ("\nName is :"+name+"\nworkrate is :"+workrate+"\nFedral tax rate is :"+ftrate);
}
public double grosspay(int h)
{
return h*workrate;
}
public double taxwithheld(double q)
{
ttax=q*ftrate;
return ttax;
}
}
class statetaxableworker extends taxableworker
{
String statename;
double strate;
statetaxableworker(String n,double w,double f,String sname,double s)
{
super(n,w,f);
statename=sname;
strate=s;
}
public void setstrate(double s)
{
strate=s;
}
public String workerinfo()
{
return ("\nName is :"+name+"\nworkrate is :"+workrate+"\nFedral tax rate is:"+ftrate+"\nState name is:"+statename+"\nState tax rate is :"+strate);
}
public double taxwithheld(double q)
{
double sttax;
ttax=ttax+(q*ftrate);
//sttax=ttax;
return ttax;
}
}
class localtaxableworker extends statetaxableworker
{
String cityname;
double ctrate;
localtaxableworker(String n,double w,double f,String c,double ct,String sname,double s)
{
super(n,w,f,sname,s);
cityname=c;
ctrate=ct;
}
public void setctrate(double cr)
{
ctrate=cr;
}
public String workerinfo()
{
return ("\nName is :"+name+"\nworkrate is :"+workrate+"\nFedral tax rate is:"+ftrate+"\nState name is:"+statename+"\nState tax rate is :"+strate+"\nCity name is :"+cityname+"\ncity tax rate is :"+ctrate);
}
public double taxwithheld(double q)
{

ttax=ttax+(q*ctrate);
return ttax;
}
}
class question2
{
public static void main(String [] args)
{
statetaxableworker ob1=new statetaxableworker("moiz",12.5,0.25,"Rawalpindi",0.05);
localtaxableworker ob2=new localtaxableworker("mateen",12.5,0.25,"islamabad",0.05,"colony",0.0250);
taxableworker ob3=new taxableworker("ibrahim", 12.5, 0.25);
double o;
System.out.println(ob1.workerinfo());
System.out.println(ob1.grosspay(12));
o=ob1.grosspay(12);
System.out.println(ob1.taxwithheld(o));

System.out.println(ob2.workerinfo());
System.out.println(ob2.grosspay(4));
System.out.println(ob2.taxwithheld(12));

System.out.println(ob3.workerinfo());
System.out.println(ob3.grosspay(9));
System.out.println(ob3.taxwithheld(10));
}
}
