package net.mirwaldt.bug;

public class DummyInterpreter implements Interpreter {
    @Override
    public <VarType extends Variable> Object query(OneVariableQuery<VarType> query) {
        return null;
    }

    @Override
    public <Var1Type extends Variable, Var2Type extends Variable> Object
    query(TwoVariablesQuery<Var1Type, Var2Type> query) {
        return null;
    }
}
