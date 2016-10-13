package ExamForWhile;
import java.util.*;
import java.io.*;

public class ExamForWhile {
	    void SumOfNumbers () {
	        Scanner s = new Scanner(System.in);
	        System.out.print("마지막 수를 입력 (Q:종료) : ");
	        String sinput = s.next();
	        if ((sinput).equals("Q") || (sinput).equals("q"))
	            return;
	        else {
	        int input = Integer.parseInt(sinput);
	        int sum = 0;
	        
	        for (int i = 0; i<= input; i++) {
	            sum += i;
	        }
	        System.out.printf("총 합은 %d 입니다.\n", sum);
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
	            System.out.print("0~100 사이의 숫자를 입력 (Q:종료) : ");
	                      a[i] = s.nextInt();
	                      if (a[i] > max) max = a[i];      
	                      if (a[i] < min) min = a[i];
	        }   
	        System.out.printf("최대값은 %d 이고 최소값은 %d 입니다.\n", max, min);
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
	            System.out.print("0~100 사이의 숫자를 입력 (Q:종료) : ");
	                      a[i] = s.nextInt();
	                      total += a[i];
	        }
	        avg = total / a.length;
	        System.out.printf(" 합계는 %d 이고, 평균은 %d 입니다.\n", total, avg);
	        }
	    }
	    
	    void GuGuDan () {
	        Scanner s = new Scanner(System.in);
	        System.out.print("출력하고 싶은 숫자를 입력 (Q:종료) : ");
	         String sinput = s.next();
	        if ((sinput).equals("Q") || (sinput).equals("q"))
	            return;
	        else {
	        int input = Integer.parseInt(sinput);
	        
	        if (input == 1 || input == 10) 
	            System.out.println("잘못 입력 하였습니다. (Q:종료) : ");
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
	        System.out.print("E : 짝수단, O : 홀수단 출력하기 (Q:종료) : ");
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
	        System.out.print("원하는 메뉴를 1~6 까지 입력하세요 : ");
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
	                System.out.print("잘못 입력하셨습니다.\n");
	                break;
	                
	        }  
	        }
	  
	    }
	    
	}



