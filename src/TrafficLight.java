public class TrafficLight {
    private double rateOfChange = 0.3;
    private String currentColor = "green";
    private int redTime = 0;

    public String getCurrentColor(){
        return currentColor;
    }

    public void operate(){

        if (currentColor.equals("red")){ //forces the light to stay red for a set number of cycles
            rateOfChange = 1;
            redTime += 1;
        }

        if(redTime == 3){  // gets the light changing colors after a certain amount of time elapses
            redTime = 0;
            rateOfChange = 0.3;
        }
        double num = Math.random(); // gets random number between 0 and 1
        if(num < rateOfChange) {  // checks whether light should be green or red
            currentColor = "red";
        }
        else
            currentColor = "green";
    }
}
