package exception;

public class CustomException extends Exception {
    CustomException(String name){
        super(name);
    }

  public   static void main(String[] args) {
        String studentName="nivetha";
        try {
            if(studentName == "nivetha"){
                throw new CustomException("The Name not match");
            }
        }catch (CustomException c){
            System.out.println(c.getMessage());
        }

    }
}
