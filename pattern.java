import java.util.Scanner;

public class pattern {

    static void p(int n){

    // Pattern No:1

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        // Pattern No:2

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


        // Pattern No:3

         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" " );
            }
            System.out.println("");
        }

        // Pattern No:4

         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" " );
            }
            System.out.println("");
        }


        // Pattern No:5

         for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* " );
            }
            System.out.println("");
        }

        // Pattern No:6

        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
            
        }

        // Pattern No:7

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        // Pattern No:8

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        // Pattern No:9

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

         for (int i = 0; i <n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        // Pattern No:10
            
         for (int i = 0; i <2*n-1; i++) {
            if (i>=n) {
                for (int j =0 ; j <= 2*n-i-2; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            }
            
         }

        // Patter No:11

        int s;
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                s=0;
            } else {
                s=1;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(s);
                s=1-s;
            }
            System.out.println("");
        }


        // Pattern No:12
            int g=2*(n-1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < g ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
            g=g-2;
        }

        // Pattern No:13


            int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                 num=num+1;
            }
            System.out.println("");
           
        }

        // Pattern No:14

        for (int i = 1; i <= n; i++) {
            for (char j ='A' ; j < 'A'+i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        // Pattern No:15

        for (int i = n; i >= 1; i--) {
            for (char j ='A' ; j < 'A'+i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        // Pattern No:16
            
          for (int i = 0; i < n; i++) {
            
            for (int j =0 ; j <=i; j++) {
                System.out.print((char)((int)('A'+i)) + " ");
            }
            System.out.println("");
            
        }

        // Pattern No:17

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            
            char a='A';
            int b=(2*i+1)/2;
            
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(a);
                  if (j>=b) {
                a--;
            } else {
                a++;
            }
                // a++;
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
                
            }
            System.out.println("");
        }

        // Pattern No:18

        for (int i = 0; i < n; i++) {
            char ch=(char)('E'-i);
            for(char j='E' ; j>=ch;j--) {
                System.out.print(j+"");
               
            }
            System.out.println("");
        }

        // Pattern 19
            int inis=0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= inis; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            inis=inis+2;
        }
            int inisp=8;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= inisp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
            inisp=inisp-2;
        }



        // Pattern No:20
            int insp=2*n-2;
            
        for (int i = 1; i < 2*n-1; i++) {
            int star=i;
             if (i>n) {
                star=2*n-i;
            } 
           
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <=insp ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if (i<n) {
                insp=insp-2;
            } else {
                insp=insp+2;
            }
        } 

        // Pattern No:21

        // Done just to get expected output

        //     int inispa=0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 0; j <inispa; j++) {
        //         System.out.print(" ");
        //     }
        //    for (int j = 1; j <= n-i; j++) {
        //         System.out.print("*");
        //     }
        //     inispa=inispa+2;
        //     System.out.println("");
        // }

        //  int inispa1=2;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j <= i+1; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <=inispa1; j++) {
        //         System.out.print(" ");
        //     }
        //    for (int j = 1; j <= i+1; j++) {
        //         System.out.print("*");
        //     }
        //     inispa1=inispa1-2;
        //     System.out.println("");
        // }

        // proper snippet

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||i==n-1||j==0||j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
      
        // Problem No:22

         // Done just to get expected output
            
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i==0||i==n-1||j==0||j==n-1) {
        //             System.out.print("4");
        //         } else if(i==1||i==n-2||j==1||j==n-2 ){
        //             System.out.print("3");
        //         }
        //         else if(i==2||i==n-3||j==2||j==n-3){
        //             System.out.print("2");
        //         }
        //         else{
        //             System.out.print("1");
        //         }
        //     }
        //     System.out.println("");
        // }

        // Proper Snippet

        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top=i;
                int left=j;
                int right=(2*n-1)-1-j;
                int bottom=(2*n-1)-1-i;
                
                System.out.print((n-Math.min(Math.min(top,bottom),Math.min(left,right))));
            }
            System.out.println("");
        }

        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows(n): ");
        int n=sc.nextInt();
        sc.close();
        p(n);
    }
}