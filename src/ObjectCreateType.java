import java.io.*;

public class ObjectCreateType implements Cloneable, Serializable {

        String   name="niveta";
        int age =20;
        int mark=80;

        public ObjectCreateType clone()throws CloneNotSupportedException{
            return (ObjectCreateType) super.clone();
        }

    /**
     *
      * @param args
     * @throws CloneNotSupportedException
     * @throws IOException
     * @throws ClassNotFoundException
     */
   public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
       System.out.println("using new keyword");
       ObjectCreateType dataname =new ObjectCreateType();
        System.out.println(dataname.name);//using new keyword
        ObjectCreateType dataage=new ObjectCreateType();
        System.out.println(dataage.age);

       System.out.println("using clone ");
       ObjectCreateType origialdata =new ObjectCreateType();//using clone
        ObjectCreateType clonedata =origialdata.clone();
       System.out.println(origialdata.name);
       System.out.println(origialdata.age);
       System.out.println(origialdata.mark);
       System.out.println(clonedata.name);
       System.out.println(clonedata.age);
       System.out.println(clonedata.mark);

       System.out.println("using serialization ");
       ObjectCreateType serialization = new ObjectCreateType();
       ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("file.txt"));
       outputStream.writeObject(serialization);
       outputStream.close();

       System.out.println("serialized successfully");


       System.out.println("using deserialization");

       ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file.txt"));

       ObjectCreateType deserialization = (ObjectCreateType) inputStream.readObject();

       inputStream.close();
       System.out.println(deserialization.name);
       System.out.println(deserialization.age);
       System.out.println(deserialization.mark);


   }
}



