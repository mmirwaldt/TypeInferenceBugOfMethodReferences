package net.mirwaldt.bug;

public class DummyInterpreter implements Interpreter {
    @Override
    public <VarType extends Variable> Object query(OneVariableQuery<VarType> query) {
        return null;
    }
}
