import java.util.ArrayList;
import java.util.List;

public class PlzGodsNo {

    private List pow = new ArrayList<String>();
    private String nameOfVariable;
    private int valueOfVariable;

    public String getNameOfVariable() {
        return nameOfVariable;
    }

    public int getValueOfVariable() {
        return valueOfVariable;
    }

    public void setNameOfVariable(String nameOfVariable) {
        this.nameOfVariable = nameOfVariable;
    }

    public void setValueOfVariable(int valueOfVariable) {
        this.valueOfVariable = valueOfVariable;
    }

    public PlzGodsNo(String nameOfVariable, int valueOfVariable) {
        setNameOfVariable(nameOfVariable);
        setValueOfVariable(valueOfVariable);
    }

    public List getPow() {
        return pow;
    }

    public List powWow() {
        pow.add("Wow!");
        pow.add("Fuf..");
        pow.add("Holly trolly!!");
        return pow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlzGodsNo plzEql = (PlzGodsNo) o;
        return this.getValueOfVariable() == plzEql.getValueOfVariable() && this.getNameOfVariable().equals(plzEql.getNameOfVariable());
    }

    @Override
    public int hashCode() {
        final int hshConst = 31;
        int result = 1;

        result = hshConst * result + this.getValueOfVariable();
        result = hshConst * result + this.getNameOfVariable().hashCode();

        return result;
    }
}