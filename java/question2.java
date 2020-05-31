class taxableworker
{
String name;
double workrate;
double ftrate;
double ttax;
taxableworker(String n,double w,double f)
{
name=x;
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
statetaxableworker(Sting n,double w,double f,String sname,double s)
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
sttax=ttax;
return sttax;
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
public double setctrate(double cr)
{
ctrate=cr;
}
public String workerinfo()
{
return ("\nName is :"+name+"\nworkrate is :"+workrate+"\nFedral tax rate is:"+ftrate+"\nState name is:"+statename+"\nState tax rate is :"+strate+"\nCity name is :"+cityname+"\ncity tax rate is :"+ctrate);
}
public double taxwithheld(double q)
{
double lttax;
sttax=sttax+(q*ctrate);
lttax=sttax;
return lttax;
}
}
class question2
{
public static void main(String [] args)
{
statetaxableworker ob1=new statetaxable("moiz",12.5,0.25,"Rawalpindi",0.05);
localtaxableworker ob2=new localtaxableworker("mateen",12.5,0.25,"islamabad",0.05,"colony",0.0250);



