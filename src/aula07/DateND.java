package aula07;

public class DateND extends Date {
    private int days;

    public DateND(int days) {
        this.days = days;
    }

    /**
     * decrements one single day from current date
     */
    public void decrement() {
        days--;
    }

    /**
     * increments one single day from current date
     */
    public void increment() {
        days++;
    }

    public void set(int days){
        this.days = days;
    }

    @Override
    public String toString() {
        return String.format("%d days difference to 1st January 2000", days);
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
