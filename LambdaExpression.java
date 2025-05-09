public class LambdaExpression {
    public static void main(String[] args) {
      
        Logger logger = new Logger() {
            public void log() {
                System.out.println("Logging info: User has logged in.");
            }
        };
        logger.log();
    }
}

@FunctionalInterface
interface Logger {
    void log();
}

