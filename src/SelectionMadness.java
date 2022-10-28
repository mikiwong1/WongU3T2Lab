public class SelectionMadness
{
    // No instance variables //

    // no-parameter constructor with "empty" body since no instance variables
    public SelectionMadness() { }

    /* Simulates randomly flipping a fair coin and returning true for heads and
       false for tails; hint: this method should use the Math.random() method to
       generate a random number.  This method returns true (heads) 50% of the
       time and false (tails) 50% of the time, on average.
     */
    public boolean flipCoin()
    { int flip = (int) (Math.random() * 2 + 1);
        if (flip == 1) {
            return true;
        } else {
            return false;
        }
    }


    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3)
    {
        int largest = num1;
        if (num2 > largest) {
            largest = num2;} else if (num3 > largest) {
        largest = num3;
    }
        return largest;
    }


    /* Returns true if the three provided lengths create a right triangle, in
       other words, a2 + b2 = c2, where c is the longest side; returns false
       Otherwise (hint: use the largest() method that you wrote above!).
       Be careful -- this is a bit more challenging than it seems!  Consider if
       side1 = 3, side2 = 4, and side3 = 5 vs. if side1 = 5, side2 = 4, and
       side3 = 3 -- will your code work regardless of which side is the longest
       of the three?
     */
    public boolean rightTriangle(int side1, int side2, int side3)
    { int largest = largest(side1, side2, side3);
        int a = 0;
        int b = 0;
        int c = 0;

        if (side1 == largest){
        a = (int) (Math.pow(side2, 2));
        b = (int) (Math.pow(side3, 2));
        c = (int) (Math.pow(side1, 2));
        }
    if (side2 == largest){
        a = (int) (Math.pow(side1, 2));
        b = (int) (Math.pow(side3, 2));
        c = (int) (Math.pow(side2, 2));
    }
    if (side3 == largest){
        a = (int) (Math.pow(side1, 2));
        b = (int) (Math.pow(side2, 2));
        c = (int) (Math.pow(side3, 2));
    }
    boolean num = (a + b == c);
    return num;
    }
}
