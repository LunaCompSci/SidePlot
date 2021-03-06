public class SidePlot{
    final static char FILL_CHAR = (char)183; 
    final static char PLOT_CHAR = 'x';
    final static char VERT_LINE = '|';
    final static char DASH_CHAR = '-';
    final static char PLUS = '+';

    public static void main(String[] args) {
        System.out.print('\u000c'); 
        plotXSquaredPlus2(-5, 5);
        plotAbsXTimes3(-6, 6);
        plotNegXSquaredPlus25 (-5, 5);
        plotSinWave(-11, 11);
    }

    public static void plotXSquaredPlus2(int min, int max){
        System.out.print("Sideways Plot" + "\n" + "y =x*x+2 where -5<=x<=5" + "\n");
        int area = 0; 
        for(int x = min;x <= max;x++){ 
            int y = x * x + 2;
            area += y; 
            int middle = (max - Math.abs(min))/2;  //finding the middle
            if (x == middle) {
                System.out.print("--" + PLUS);
            }else {
                System.out.print("  " + VERT_LINE);

            }
            for(int col = 1;col <= y;col++){
                if (x==middle){ //First 2 dashs
                    System.out.print(DASH_CHAR);
                } else{
                    System.out.print(FILL_CHAR); //First two dots for every other line other than the middle
                }
            }
            System.out.print(PLOT_CHAR);
            y = max * max + 2;
            if (x==middle){
                for(int i = 0; i < y; i++){
                    System.out.print(DASH_CHAR);
                }
            }
            System.out.println();
        }
        System.out.println("The area under the plot is " + area + "\n"); 
    }

    public static void plotAbsXTimes3(int min, int max){
        System.out.print("Sideways Plot" + "\n" + "y = |x|*3, where -6<=x<=6" + "\n");
        int area = 0; 
        for(int x = min; x <= max;x++){
            int y = Math.abs(x) * 3;
            area += y;
            int middle = (max - Math.abs(min))/2;  //finding the middle
            if (x == middle) {
                System.out.print("--" + PLUS);
            }else {
                System.out.print("  " + VERT_LINE);

            }
            for(int col = 1; col <= y; col++){
                if (x==middle){ //First 2 dashs
                    System.out.print(DASH_CHAR);
                } else{
                    System.out.print(FILL_CHAR); //First two dots for every other line other than the middle
                }
            }
            System.out.print(PLOT_CHAR);
            y = Math.abs(max) * 3;
            if (x==middle){
                for(int i = 0; i < y; i++){
                    System.out.print(DASH_CHAR);
                }
            }
            System.out.println();
        }
        System.out.println("The area under the plot is " + area + "\n");
    }

    public static void plotNegXSquaredPlus25 (int min, int max) {
        System.out.print("Sideways Plot" + "\n" + "y = -(x*x)+25 where -5<=x<=5" + "\n");
        int area = 0;
        for(int x = min; x <= max;x++){  
            int y = (-x * x) + 25;
            area += y;
            int middle = (max - Math.abs(min))/2;  //finding the middle
            if (x == middle) {
                System.out.print("--" + PLUS);
            }else {
                System.out.print("  " + VERT_LINE);

            }
            for(int col = 1; col <= y; col++){
                if (x==middle){ //First 2 dashs
                    System.out.print(DASH_CHAR);
                } else{
                    System.out.print(FILL_CHAR); //First two dots for every other line other than the middle
                }
            }
            System.out.println(PLOT_CHAR);
        }
        System.out.println("The area under the plot is " + area + "\n");
    }

    public static void plotSinWave(int min, int max){
        System.out.print("Sideways Plot" + "\n" + "y = 20sin(.5x)+20 where -11<=x<=11" + "\n");
        int area = 0;    
        for(int x = min; x<= max; x++){
            int y = (int)(20 * Math.sin(x * .5) + 20);
            area += y;
            int middle = (max - Math.abs(min))/2;
            if (x == middle) {
                System.out.print("--" + PLUS);
            }else {
                System.out.print("  " + VERT_LINE);

            }
            for(int col = 1; col <= y; col++){
                if (x==middle){ //First 2 dashs
                    System.out.print(DASH_CHAR);
                } else{
                    System.out.print(FILL_CHAR); //First two dots for every other line other than the middle
                }
            }
            System.out.println(PLOT_CHAR);
        }
        System.out.println("The area under the plot is " + area + "\n");
    }
}
