import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
        public static void main(String[] args) {
                new HelloWorld().init();
        }

        @Override
        public void init() {
                get("/hi", (req, res) -> "Hello guys !");
                get("/", (req, res) -> "welome to my app");
                get("/slt", (req, res) -> "cv!");
                get("/fcb", (req, res) -> "visca barca!");
        }
}

