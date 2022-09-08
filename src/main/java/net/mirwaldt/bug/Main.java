package net.mirwaldt.bug;

public class Main {
    public static void main(String[] args) {
        System.getProperties().forEach((key, value) -> System.out.println(key + "=" + value));
        Interpreter interpreter = new DummyInterpreter();
        interpreter.query(MyFact::new); // causes exception
        /*
            Exception in thread "main" java.lang.BootstrapMethodError: bootstrap method initialization exception
                at java.base/java.lang.invoke.BootstrapMethodInvoker.invoke(BootstrapMethodInvoker.java:185)
                at java.base/java.lang.invoke.CallSite.makeSite(CallSite.java:315)
                at java.base/java.lang.invoke.MethodHandleNatives.linkCallSiteImpl(MethodHandleNatives.java:281)
                at java.base/java.lang.invoke.MethodHandleNatives.linkCallSite(MethodHandleNatives.java:271)
                at net.mirwaldt.bug.Main.main(Main.java:6)
            Caused by: java.lang.invoke.LambdaConversionException: Type mismatch for lambda argument 0: interface net.mirwaldt.bug.StringLiteral is not convertible to interface net.mirwaldt.bug.Variable
                at java.base/java.lang.invoke.AbstractValidatingLambdaMetafactory.validateMetafactoryArgs(AbstractValidatingLambdaMetafactory.java:293)
                at java.base/java.lang.invoke.LambdaMetafactory.altMetafactory(LambdaMetafactory.java:501)
                at java.base/java.lang.invoke.BootstrapMethodInvoker.invoke(BootstrapMethodInvoker.java:138)
                ... 4 more
         */
//        interpreter.<StringVariable>query(MyFact::new); // fixes it
    }
}
