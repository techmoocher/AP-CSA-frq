public class Feeder
{
    private int currentFood;
    public void simulateOneDay (int numBirds) {
        int case_status = (int) (Math.random() * ((100 - 1) + 1)) + 1;
        // Normal case
        if (case_status >= 1 && case_status <= 95) {
            int food_per_bird = (int) (Math.random() * ((50 - 10) + 1)) + 10;
            if (food_per_bird * numBirds >= currentFood) {
                currentFood = 0;
            }
            else {
                currentFood -= numBirds * food_per_bird;
            }
        }
        // Case with the visit of a bear
        else if (case_status >= 96 && case_status <= 100) {
            int leftover = 0;
        }
    }
    
    public int simulateManyDays(int numBirds, int numDays) {
        for (int i = 0; i < numDays; i++) {
            if (currentFood == 0) {
                return i;
            }
            simulateOneDay(numBirds);
        }
        return numDays;
    }
}
