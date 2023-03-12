public class Calculator {
    //global static/class variable
   static int a= 20;
    static int b= 10;
    static int answer;


    //no return type parameter user defined method
        static void addition(){
        answer = a+b;
        System.out.println(answer);
        }

        static void subtraction(){
         answer = a- b;
                 System.out.println(answer);
        }

        static void multiplication(){
        answer=a*b;
        System.out.println(answer);
        }

        static void division(){
        answer=a/b;
        System.out.println(answer);
        }


        //main method

        public static void main(String[] args){
        addition();
        subtraction();
        multiplication();
        division();
        }
}






