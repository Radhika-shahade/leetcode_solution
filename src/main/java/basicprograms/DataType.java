package basicprograms;
//The size of a Long variable is given as 8 bytes.
//given data types we have to print its value in bytes
public class DataType {

    public static int sizeInBytes(String dataType)
    {
        if(dataType.contains("Integer")|| dataType.contains("Float"))
        {
            return 4;
        }
        if(dataType.contains("Long")||dataType.contains("Double"))
        {
            return 8;
        }
        if(dataType.contains("Character"))
        {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sizeInBytes("Integer"));

    }
}
