package net.mirwaldt.bug;

public final class StringVariable implements StringLiteral, Variable {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
