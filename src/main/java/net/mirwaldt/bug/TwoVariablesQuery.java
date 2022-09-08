package net.mirwaldt.bug;

@FunctionalInterface
public interface TwoVariablesQuery<
        Var1Type extends Variable,
        Var2Type extends Variable
        > extends Query {
    Object eval(Var1Type var1, Var2Type var2);
}
