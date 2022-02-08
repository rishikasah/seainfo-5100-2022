package homework1;

/*
 * Question 6 - Homework 1
 * Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
 * Plus $ 0.60 per call for next 50 calls.
 * Plus $ 0.50 per call for next 50 calls.
 * Plus $ 0.40 per call for any call beyond 200 calls.
 * Use Switch Statement in the function.
 */
public class PhoneBill {

    public float generatePhoneBill(int calls) {

        float phoneBill = 0f;

        switch (1) {
            case 1:
                if (calls > 200) {
                    phoneBill += (calls - 200) * 0.40;
                    calls = 200;
                }
            case 2:
                if (calls >= 150 && calls <= 200) {
                    phoneBill += (calls - 150) * 0.50;
                    calls = 150;
                }
            case 3:
                if (calls >= 100 && calls <= 150) {
                    phoneBill += (calls - 100) * 0.60;
                    calls = 100;
                }
            default:
                phoneBill += 200;
                break;
        }

        return phoneBill;

    }
}
