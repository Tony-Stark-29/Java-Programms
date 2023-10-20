import static java.lang.String.format;

public class logLevels
{
    public  String message(String logLine) {
        return logLine.split("]: ")[1]
                .trim();
    }


    public String logLevel(String logLine) {
        return logLine.split("]: ")[0]
                .substring(1)
                .toLowerCase();
    }

    public  String reformat(String logLine) {
       return  format("%s (%s)", message(logLine), logLevel(logLine));
    }
    public static void main(String[] args)
    {

        logLevels l1=new logLevels();
        System.out.println( l1.message("[ERROR]: Invalid operation"));
        System.out.println( l1.message("[WARNING]:  Disk almost full\r\n"));
        System.out.println( l1.message("[ERROR]: Invalid operation"));

        System.out.println();

        System.out.println( l1.logLevel("[ERROR]: Invalid operation"));
        System.out.println( l1.logLevel("[WARNING]:  Disk almost full\r\n"));
        System.out.println( l1.logLevel("[ERROR]: Invalid operation"));

        System.out.println();

        System.out.println( l1.reformat("[ERROR]: Invalid operation"));
        System.out.println( l1.reformat("[WARNING]:  Disk almost full\r\n"));
        System.out.println( l1.reformat("[ERROR]: Invalid operation"));

    }
}
