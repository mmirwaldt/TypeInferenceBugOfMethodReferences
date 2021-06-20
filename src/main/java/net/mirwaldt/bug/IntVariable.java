package net.mirwaldt.bug;

public final class IntVariable implements IntLiteral, Variable {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int value() {
        return value;
    }
}
