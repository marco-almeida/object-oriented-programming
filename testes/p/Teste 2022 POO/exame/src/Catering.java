public class Catering extends Activity {
    private Option option;

    public Catering(Catering.Option option, int participantes) {
        super(participantes);
        this.option = option;
        setPreco(25);
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return String.format("'%s' for %d participants", option.toString(), getParticipantes());
    }

    public enum Option {
        FULL_MENU,
        DRINKS_AND_SNACKS,
        LIGHT_BITES;
    }
}
