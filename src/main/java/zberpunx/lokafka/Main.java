package zberpunx.lokafka;

import io.github.embeddedkafka.EmbeddedKafka$;
import io.github.embeddedkafka.EmbeddedKafkaConfig$;

public class Main {
    public static void main(String[] args) {
        EmbeddedKafka$.MODULE$.start(
                //zkPort=6000, kafkaPort=6001
                EmbeddedKafkaConfig$.MODULE$.defaultConfig());
    }
}
