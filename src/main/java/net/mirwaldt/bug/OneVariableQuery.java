package net.mirwaldt.bug;

@FunctionalInterface
public interface OneVariableQuery<VarType extends Variable> extends Query {
    Object query(VarType var1);
}
