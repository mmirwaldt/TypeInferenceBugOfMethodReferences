package net.mirwaldt.bug;

public interface Interpreter {
    <VarType extends Variable> Object query(OneVariableQuery<VarType> query);
}
