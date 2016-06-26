package practice;

import java.util.Scanner;

public class BinaryCode {
	
	String[] decode(String message){
		
		char [] msg,p1Arr = null,p0Arr=null;
		int [] p1,p0;
		String[] bigBoss = {"",""};
		String p00="",p11="";
		msg=message.toCharArray();
		int len;
		len=msg.length;
		//m=new int[len];
		p1=new int[len];
		p0=new int[len];
		
		
		
		for(int count=0;count<msg.length;count++){
			//m[count]=(int)msg[count];
			
			if(count==0){
				p1[count]=1;
				p0[count]=0;
			}
			else if(count==1){
				p1[count]=msg[(count-1)]-p1[(count-1)];
				p0[count]=msg[(count-1)]-p0[(count-1)];
					if(p1[count]>1 || p1[count]<0)
						p11="NONE";
					if(p0[count]>1 || p0[count]<0)
						p00="NONE";
				
			}else if(count!=(msg.length-1)){
				p1[count]=msg[(count-2)]-(p1[(count-1)]+p1[(count-2)]);
				p0[count]=msg[(count-2)]-(p0[(count-1)]+p0[(count-2)]);
					if(p1[count]>1 || p1[count]<0)
						p11="NONE";
					if(p0[count]>1 || p0[count]<0)
						p00="NONE";
			}else{
				if(msg[count]==(p1[count]+p1[count-1])){
					;
				}else{
					p11="NONE";
				}
				if(msg[count]==(p0[count]+p0[count-1])){
					;
				}else{
					p00="NONE";
				}
			}
		}
		
		for(int i=0;i<msg.length;i++){
			if(!p00.equals("NONE")){
				p0Arr[i]=(char) p0[i];
			}
			if(!p11.equals("NONE")){
				p1Arr[i]=(char) p1[i];
			}
		}
		
		if(!p00.equals("NONE"))
			p00=new String(p0Arr);
		
		if(!p11.equals("NONE"))
			p11=new String(p0Arr);
		
		bigBoss[0]=p00;
		bigBoss[1]=p11;
		
		
		return bigBoss;
		
	}
	
	public static void main (String args[]){
		BinaryCode  bc=new BinaryCode();
		System.out.println("Input the values");
		Scanner sc=new Scanner(System.in);
		String message=sc.next();
		String[] result=bc.decode(message);
		System.out.println(result[0]+","+result[1]);
	}

}
