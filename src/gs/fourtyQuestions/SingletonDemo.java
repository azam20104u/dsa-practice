package gs.fourtyQuestions;

public class SingletonDemo {
    private SingletonDemo(){}
    private static class Holder{
        private static final SingletonDemo INSTANCE = new SingletonDemo();
    }
    public static SingletonDemo getInstance(){
        return Holder.INSTANCE;
    }
    private static volatile SingletonDemo sd;
    public static SingletonDemo getSd(){
        if (sd==null){
            synchronized (SingletonDemo.class){
                if (sd==null) sd = new SingletonDemo();
            }
        }
        return sd;
    }
}
