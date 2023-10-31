public class problem_21
{
    public static void main(String[] args) {
        double angle = 90;

        double angleToRadians=Math.toRadians(angle);
        double sinOfNum=Math.sin((angleToRadians));
        double cosOfNum=Math.cos((angleToRadians));
        double tanOfNum=Math.tan((angleToRadians));

        double sec=(1/sinOfNum);
        double cosec=(1/cosOfNum);
        double cot=(1/tanOfNum);
    }
}
