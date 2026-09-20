public class VariableType {

        String name;              // Instance variable  and object variable and dynamic variable
        static String college="SSMIET"; // Static variable and class variable
        static int Year=3 ;// Static variable
        int mark;// Instance variable
        void display() {
            System.out.println("Name    : "+name);
            System.out.println( "College   :"+college);
            System.out.println("Mark  :"+mark);
            System.out.println("=======");
        }

        public static void main(String[] args) {

            VariableType s1 = new VariableType();
            VariableType s2 = new VariableType();
            s1.name="nivetha";
            s1.mark=85;
            s2.name="priya";
            s2.mark=89;



            s1.display();
            s2.display();
            System.out.println("Year:"+ Year);

        }
    }


