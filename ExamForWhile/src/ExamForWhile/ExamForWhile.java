package ExamForWhile;
import java.util.*;
import java.io.*;

public class ExamForWhile {
	    void SumOfNumbers () {
	        Scanner s = new Scanner(System.in);
	        System.out.print("������ ���� �Է� (Q:����) : ");
	        String sinput = s.next();
	        if ((sinput).equals("Q") || (sinput).equals("q"))
	            return;
	        else {
	        int input = Integer.parseInt(sinput);
	        int sum = 0;
	        
	        for (int i = 0; i<= input; i++) {
	            sum += i;
	        }
	        System.out.printf("�� ���� %d �Դϴ�.\n", sum);
	        }
	        
	    }
	    
	    void MaxAndMin () {
	        Scanner s = new Scanner(System.in);
	        String sinput = s.next();
	        if ((sinput).equals("Q") || (sinput).equals("q"))
	            return;
	        else {
	        int input = Integer.parseInt(sinput);
	        
	        int max = 0;
	        int min = 999999999;
	       
	        int a [] = new int [5];
	        for (int i =0; i<a.length; i++)
	        {
	            System.out.print("0~100 ������ ���ڸ� �Է� (Q:����) : ");
	                      a[i] = s.nextInt();
	                      if (a[i] > max) max = a[i];      
	                      if (a[i] < min) min = a[i];
	        }   
	        System.out.printf("�ִ밪�� %d �̰� �ּҰ��� %d �Դϴ�.\n", max, min);
	    }}
	    
	    void SumAndAvg () {
	        Scanner s = new Scanner(System.in);
	         String sinput = s.next();
	        if ((sinput).equals("Q") || (sinput).equals("q"))
	            return;
	        else {
	        int input = Integer.parseInt(sinput);
	        int total = 0, avg = 0;
	       
	        int a [] = new int [5];
	        for (int i =0; i<a.length; i++)
	        {
	            System.out.print("0~100 ������ ���ڸ� �Է� (Q:����) : ");
	                      a[i] = s.nextInt();
	                      total += a[i];
	        }
	        avg = total / a.length;
	        System.out.printf(" �հ�� %d �̰�, ����� %d �Դϴ�.\n", total, avg);
	        }
	    }
	    
	    void GuGuDan () {
	        Scanner s = new Scanner(System.in);
	        System.out.print("����ϰ� ���� ���ڸ� �Է� (Q:����) : ");
	         String sinput = s.next();
	        if ((sinput).equals("Q") || (sinput).equals("q"))
	            return;
	        else {
	        int input = Integer.parseInt(sinput);
	        
	        if (input == 1 || input == 10) 
	            System.out.println("�߸� �Է� �Ͽ����ϴ�. (Q:����) : ");
	        else  
	        {
	            for (int i = 1; i <=9; i ++)
	            {
	                System.out.printf(" %d * %d = %d \n ", input , i, input * i) ;
	            }
	        }
	        }
	    }
	    
	    void GuGuDan2 () throws IOException {
	        System.out.print("E : ¦����, O : Ȧ���� ����ϱ� (Q:����) : ");
	        char s = (char)System.in.read();
	        int g = 0;
	        
	        if(s == 'Q' || s == 'q' )
	            return;
	        if(s == 'E' || s == 'e' )
	             g = 2;
	        if(s == 'O' || s == 'o') 
	             g = 3;
	        
	        for (int i = g; i<=9; i+= g) {
	            for (int j = 1; j<= 9; j++){
	                System.out.printf(" %d * %d = %d \n ", i , j,  i * j);
	            }
	            System.out.println();
	        }
	        
	    }


	    public static void main(String[] args) throws IOException {
	        while (true) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("���ϴ� �޴��� 1~6 ���� �Է��ϼ��� : ");
	        int menu = s.nextInt();
	        
	        switch (menu) 
	        {
	            case 1:
	                new ExamForWhile().SumOfNumbers();
	                break;
	            case 2:
	                new ExamForWhile().MaxAndMin();
	                break;
	            case 3:
	                new ExamForWhile().SumAndAvg();
	                break;
	            case 4:
	                new ExamForWhile().GuGuDan();
	                break;
	            case 5:
	                new ExamForWhile().GuGuDan2();
	                break;
	            case 6:
	                System.exit(menu);
	                break;
	            default :
	                System.out.print("�߸� �Է��ϼ̽��ϴ�.\n");
	                break;
	                
	        }  
	        }
	  
	    }
	    
	}



