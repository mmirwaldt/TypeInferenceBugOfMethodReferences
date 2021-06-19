package net.mirwaldt.bug;

public interface OneVariableQuery<VarType extends Variable> extends Query {
    Object query(VarType var1);
}
