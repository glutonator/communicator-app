package communicator.core.messages;


/**
 * Jackson2JsonMessageConverter need both setters and getters and constructor without parameters
 */
public class MessageCustom {

    private String textFiled;

    private int intField;

    private  double doubleField;

    public MessageCustom() {
    }

    public MessageCustom(String textFiled) {
        this.textFiled = textFiled;
    }

    public MessageCustom(String textFiled, int intField, double doubleField) {
        this.textFiled = textFiled;
        this.intField = intField;
        this.doubleField = doubleField;
    }


    public String getTextFiled() {
        return textFiled;
    }

    public void setTextFiled(String textFiled) {
        this.textFiled = textFiled;
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public double getDoubleField() {
        return doubleField;
    }

    public void setDoubleField(double doubleField) {
        this.doubleField = doubleField;
    }

    @Override
    public String toString() {
        return "MessageCustom{" +
                "textFiled='" + textFiled + '\'' +
                ", intField=" + intField +
                ", doubleField=" + doubleField +
                '}';
    }
}
