package com.gft.assetstream.genevaconsumer;

import com.gft.assetstream.genevaconsumer.business.domain.Asset;
import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class GenevaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenevaConsumerApplication.class, args);
    }

    @Bean
    public Consumer<Asset> consumeAsset() {
        return (Asset asset) -> {
            log.info("Geneva accepting asset {}", asset);
        };
    }
}
