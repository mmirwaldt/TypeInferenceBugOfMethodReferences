package net.mirwaldt.bug;

public interface Interpreter {
    <VarType extends Variable> Object query(OneVariableQuery<VarType> query);

    <Var1Type extends Variable, Var2Type extends Variable> Object query(TwoVariablesQuery<Var1Type, Var2Type> query);
}
